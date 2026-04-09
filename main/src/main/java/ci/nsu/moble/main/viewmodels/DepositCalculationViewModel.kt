package ci.nsu.moble.main.viewmodels

import androidx.lifecycle.ViewModel
import ci.nsu.moble.main.data.CalculationState

class DepositCalculationViewModel : ViewModel() {
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
            if (state.monthlyTopUp.isNotEmpty()) {
                current += state.monthlyTopUp.toDoubleOrNull() ?: 0.0
            }
        }

        state = state.copy(
            finalAmount = current,
            interestEarned = totalInterest
        )
    }

    fun getAvailableRate(): Double {
        val months = state.depositTerm.toIntOrNull() ?: 0
        return when {
            months < 6 -> 15.0
            months < 12 -> 10.0
            else -> 5.0
        }
    }

    fun reset() {
        state = CalculationState()
    }
}