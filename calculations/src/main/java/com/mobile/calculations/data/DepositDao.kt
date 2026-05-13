package com.mobile.calculations.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface DepositDao {
    @Query("SELECT * FROM deposit_calculations WHERE userId = :userId ORDER BY calculationDate DESC")
    fun getCalculationsForUser(userId: Long): Flow<List<DepositCalculation>>

    @Insert
    suspend fun insertCalculation(calculation: DepositCalculation)

    @Query("SELECT * FROM deposit_calculations WHERE id = :id AND userId = :userId")
    suspend fun getCalculationByIdAndUser(id: Long, userId: Long): DepositCalculation?

    @Query("DELETE FROM deposit_calculations WHERE id = :id AND userId = :userId")
    suspend fun deleteCalculationById(id: Long, userId: Long)
}