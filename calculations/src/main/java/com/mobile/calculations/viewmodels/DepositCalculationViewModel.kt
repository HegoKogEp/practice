package com.mobile.calculations.viewmodels

import androidx.lifecycle.ViewModel
import com.mobile.calculations.data.DepositCalculation
import com.mobile.calculations.data.repository.DepositRepository
import com.mobile.calculations.data.state.CalculationState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class DepositCalculationViewModel(
    private val repository: DepositRepository
) : ViewModel() {
    private val _state = MutableStateFlow(CalculationState())
    val state: StateFlow<CalculationState> = _state

    fun updateInitialParams(fee: String, term: String) {
        _state.value = _state.value.copy(entryFee = fee, depositTerm = term)
    }

    fun setRateAndTopUp(rate: Double, topUp: String) {
        _state.value = _state.value.copy(interestRate = rate, monthlyTopUp = topUp)
    }

    fun calculate() {
        val currentState = _state.value
        val initial = currentState.entryFee.toDoubleOrNull() ?: return
        val months = currentState.depositTerm.toIntOrNull() ?: return
        if (initial <= 0 || months <= 0) return

        val monthlyRate = currentState.interestRate / 100 / 12
        var current = initial
        var totalInterest = 0.0

        repeat(months) {
            val interest = current * monthlyRate
            totalInterest += interest
            current += interest
            currentState.monthlyTopUp.toDoubleOrNull()?.let { current += it }
        }

        _state.value = currentState.copy(finalAmount = current, interestEarned = totalInterest)
    }

    fun getAvailableRate(): Double {
        val months = _state.value.depositTerm.toIntOrNull() ?: 0
        return when {
            months < 6 -> 15.0
            months < 12 -> 10.0
            else -> 5.0
        }
    }

    suspend fun saveCalculation(userId: Long): Boolean {
        val currentState = _state.value
        return try {
            val calculation = DepositCalculation(
                userId = userId,
                initialAmount = currentState.entryFee.toDoubleOrNull() ?: 0.0,
                periodMonths = currentState.depositTerm.toIntOrNull() ?: 0,
                interestRate = currentState.interestRate,
                monthlyTopUp = currentState.monthlyTopUp.toDoubleOrNull(),
                finalAmount = currentState.finalAmount,
                interestEarned = currentState.interestEarned,
                calculationDate = System.currentTimeMillis()
            )
            repository.insertCalculation(calculation)
            true
        } catch (e: Exception) {
            false
        }
    }

    fun reset() {
        _state.value = CalculationState()
    }
}