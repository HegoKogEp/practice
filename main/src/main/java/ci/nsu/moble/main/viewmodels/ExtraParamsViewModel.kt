package ci.nsu.moble.main.viewmodels

import androidx.lifecycle.ViewModel

class ExtraParamsViewModel : ViewModel() {
    var entryFee: Double = 0.0
    var depositTerm: Int = 0
    var monthlyTopUp: String = ""
    var selectedRate: Double = 0.0

    fun calculateAvaibleRates(): Double {
        return when {
            depositTerm < 6 -> 15.0
            depositTerm < 12 -> 10.0
            else -> 5.0
        }
    }

    fun calculateResult(): Pair<Double, Double> {
        val monthlyRate = selectedRate / 100 / 12
        var currentAmount = entryFee
        var totalInterest = 0.0

        for (month in 1..depositTerm) {
            val monthlyInterest = currentAmount * monthlyRate
            totalInterest += monthlyInterest
            currentAmount += monthlyInterest

            if (monthlyTopUp.isNotEmpty()) {
                val topUp = monthlyTopUp.toDoubleOrNull() ?: 0.0
                currentAmount += topUp
            }
        }
        return Pair(currentAmount, totalInterest)
    }
}