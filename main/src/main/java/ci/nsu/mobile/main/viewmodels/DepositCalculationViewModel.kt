package ci.nsu.mobile.main.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ci.nsu.mobile.main.data.DepositCalculation
import ci.nsu.mobile.main.data.repository.DepositRepository
import ci.nsu.mobile.main.data.state.CalculationState
import kotlinx.coroutines.launch

class DepositCalculationViewModel(
    private val repository: DepositRepository,
    private val getCurrentUserId: () -> Long?
) : ViewModel() {
    var state: CalculationState = CalculationState()
        private set

    fun updateInitialParams(fee: String, term: String) {
        state = state.copy(entryFee = fee, depositTerm = term)
    }

    fun setRateAndTopUp(rate: Double, topUp: String) {
        state = state.copy(interestRate = rate, monthlyTopUp = topUp)
    }

    fun calculate() {
        val initial = state.entryFee.toDoubleOrNull() ?: return
        val months = state.depositTerm.toIntOrNull() ?: return
        if (initial <= 0 || months <= 0) return

        val monthlyRate = state.interestRate / 100 / 12
        var current = initial
        var totalInterest = 0.0

        repeat(months) {
            val interest = current * monthlyRate
            totalInterest += interest
            current += interest
            state.monthlyTopUp.toDoubleOrNull()?.let { current += it }
        }

        state = state.copy(finalAmount = current, interestEarned = totalInterest)
    }

    fun getAvailableRate(): Double {
        val months = state.depositTerm.toIntOrNull() ?: 0
        return when {
            months < 6 -> 15.0
            months < 12 -> 10.0
            else -> 5.0
        }
    }

    suspend fun saveCalculation(): Boolean {
        val userId = getCurrentUserId() ?: return false
        val calculation = DepositCalculation(
            userId = userId,
            initialAmount = state.entryFee.toDoubleOrNull() ?: 0.0,
            periodMonths = state.depositTerm.toIntOrNull() ?: 0,
            interestRate = state.interestRate,
            monthlyTopUp = state.monthlyTopUp.toDoubleOrNull(),
            finalAmount = state.finalAmount,
            interestEarned = state.interestEarned,
            calculationDate = System.currentTimeMillis()
        )
        repository.insertCalculation(calculation)
        return true
    }

    fun reset() {
        state = CalculationState()
    }
}