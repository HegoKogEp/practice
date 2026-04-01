package ci.nsu.moble.main.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ci.nsu.moble.main.data.DepositCalculation
import ci.nsu.moble.main.data.DepositRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class HistoryViewModel(private val repository: DepositRepository) : ViewModel() {

    val calculations: Flow<List<DepositCalculation>> = repository.getAllCalculations()

    fun insertCalculation(calculation: DepositCalculation) {
        viewModelScope.launch {
            repository.insertCalculation(calculation)
        }
    }

    suspend fun getCalculationById(id: Long) : DepositCalculation? {
        return repository.getCalculationById(id)
    }
}