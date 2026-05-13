package com.mobile.calculations.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.calculations.data.DepositCalculation
import com.mobile.calculations.data.repository.DepositRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class HistoryViewModel(private val repository: DepositRepository, private val userId: Long) : ViewModel() {
    val calculations: Flow<List<DepositCalculation>> = repository.getCalculationsForUser(userId)
    fun deleteCalculation(id: Long) { viewModelScope.launch { repository.deleteCalculationById(id, userId) } }
    suspend fun getCalculationById(id: Long): DepositCalculation? = repository.getCalculationByIdAndUser(id, userId)
}