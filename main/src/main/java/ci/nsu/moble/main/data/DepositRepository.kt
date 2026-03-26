package ci.nsu.moble.main.data

import kotlinx.coroutines.flow.Flow

class DepositRepository(private val depositDao: DepositDao) {
    fun getAllCalculations(): Flow<List<DepositCalculation>> {
        return depositDao.getAllCalculations()
    }

    suspend fun insertCalculation(calculation: DepositCalculation) {
        depositDao.insertCalculation(calculation)
    }

    suspend fun getCalculationById(id: Long): DepositCalculation? {
        return depositDao.getCalculationById(id)
    }
}