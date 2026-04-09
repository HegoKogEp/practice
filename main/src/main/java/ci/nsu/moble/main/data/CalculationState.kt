package ci.nsu.moble.main.data

data class CalculationState(
    val entryFee: String = "",
    val depositTerm: String = "",
    val interestRate: Double = 0.0,
    val monthlyTopUp: String = "",
    val finalAmount: Double = 0.0,
    val interestEarned: Double = 0.0
)
