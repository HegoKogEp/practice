package com.mobile.calculations.impl

import com.mobile.calculations.data.repository.DepositRepository
import com.mobile.domain.calculations.CalculationResult
import com.mobile.domain.calculations.CalculationsProvider
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class CalculationsProviderImpl(private val repository: DepositRepository) : CalculationsProvider {
    override fun getCalculationsForUser(userId: Long): Flow<List<CalculationResult>> =
        repository.getCalculationsForUser(userId).map { it.map { calc -> calc.toDomain() } }

    override suspend fun saveCalculation(calculation: CalculationResult): Boolean {
        val entity = com.mobile.calculations.data.DepositCalculation(
            id = calculation.id, userId = calculation.userId, initialAmount = calculation.initialAmount,
            periodMonths = calculation.periodMonths, interestRate = calculation.interestRate,
            monthlyTopUp = calculation.monthlyTopUp, finalAmount = calculation.finalAmount,
            interestEarned = calculation.interestEarned, calculationDate = calculation.calculationDate
        )
        repository.insertCalculation(entity)
        return true
    }

    override suspend fun deleteCalculation(calculationId: Long, userId: Long) =
        repository.deleteCalculationById(calculationId, userId)
}

private fun com.mobile.calculations.data.DepositCalculation.toDomain(): CalculationResult =
    CalculationResult(id, userId, initialAmount, periodMonths, interestRate, monthlyTopUp, finalAmount, interestEarned, calculationDate)