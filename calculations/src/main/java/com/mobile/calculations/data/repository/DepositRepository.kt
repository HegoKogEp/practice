package com.mobile.calculations.data.repository

import com.mobile.calculations.data.DepositCalculation
import com.mobile.calculations.data.DepositDao
import kotlinx.coroutines.flow.Flow

class DepositRepository(private val depositDao: DepositDao) {
    fun getCalculationsForUser(userId: Long): Flow<List<DepositCalculation>> =
        depositDao.getCalculationsForUser(userId)

    suspend fun insertCalculation(calculation: DepositCalculation) =
        depositDao.insertCalculation(calculation)

    suspend fun getCalculationByIdAndUser(id: Long, userId: Long) =
        depositDao.getCalculationByIdAndUser(id, userId)

    suspend fun deleteCalculationById(id: Long, userId: Long) =
        depositDao.deleteCalculationById(id, userId)
}