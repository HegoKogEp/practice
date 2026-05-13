package com.mobile.calculations.di

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mobile.calculations.data.CalculationsDatabase
import com.mobile.calculations.data.repository.DepositRepository
import com.mobile.calculations.viewmodels.DepositCalculationViewModel
import com.mobile.calculations.viewmodels.HistoryViewModel

class CalculationsServiceLocator(private val context: Context) {
    val database: CalculationsDatabase by lazy { CalculationsDatabase.getDatabase(context) }
    val depositRepository: DepositRepository by lazy { DepositRepository(database.depositDao()) }

    val depositCalculationViewModelFactory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return when {
                modelClass.isAssignableFrom(DepositCalculationViewModel::class.java) ->
                    DepositCalculationViewModel(depositRepository) as T
                else -> throw IllegalArgumentException("Unknown ViewModel")
            }
        }
    }

    fun getHistoryViewModel(userId: Long): HistoryViewModel = HistoryViewModel(depositRepository, userId)

    companion object {
        private lateinit var instance: CalculationsServiceLocator
        fun init(context: Context) { instance = CalculationsServiceLocator(context) }
        fun getInstance(): CalculationsServiceLocator = instance
    }
}