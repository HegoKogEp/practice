package ci.nsu.moble.main.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface DepositDao {
    @Query("select * from deposit_calculations order by calculationDate desc")
    fun getAllCalculations(): Flow<List<DepositCalculation>>

    @Insert
    suspend fun insertCalculation(calculation: DepositCalculation)

    @Query("select * from deposit_calculations where id = :id")
    suspend fun getCalculationById(id: Long): DepositCalculation?
}