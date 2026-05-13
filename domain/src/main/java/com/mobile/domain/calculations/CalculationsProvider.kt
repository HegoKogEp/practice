package com.mobile.domain.calculations

import kotlinx.coroutines.flow.Flow

interface CalculationsProvider {
    fun getCalculationsForUser(userId: Long): Flow<List<CalculationResult>>
    suspend fun saveCalculation(calculation: CalculationResult): Boolean
    suspend fun deleteCalculation(calculationId: Long, userId: Long)
}