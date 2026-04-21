package ci.nsu.mobile.main.di

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ci.nsu.mobile.main.data.AppDatabase
import ci.nsu.mobile.main.data.local.TokenManager
import ci.nsu.mobile.main.data.repository.AuthRepository
import ci.nsu.mobile.main.data.repository.DepositRepository
import ci.nsu.mobile.main.viewmodels.*

class ServiceLocator(private val context: Context) {
    val database: AppDatabase by lazy { AppDatabase.getDatabase(context) }
    val depositRepository: DepositRepository by lazy { DepositRepository(database.depositDao()) }
    val authRepository: AuthRepository by lazy { AuthRepository() }

    // Фабрика ViewModel
    val viewModelFactory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return when {
                modelClass.isAssignableFrom(LoginViewModel::class.java) ->
                    LoginViewModel(authRepository) as T
                modelClass.isAssignableFrom(RegisterViewModel::class.java) ->
                    RegisterViewModel(authRepository) as T
                modelClass.isAssignableFrom(UsersViewModel::class.java) ->
                    UsersViewModel(authRepository) as T
                modelClass.isAssignableFrom(DepositCalculationViewModel::class.java) ->
                    DepositCalculationViewModel(depositRepository, { TokenManager.userId }) as T
                modelClass.isAssignableFrom(HistoryViewModel::class.java) -> {
                    val userId = TokenManager.userId ?: throw IllegalStateException("User not logged in")
                    HistoryViewModel(depositRepository, userId) as T
                }
                else -> throw IllegalArgumentException("Unknown ViewModel class")
            }
        }
    }

    companion object {
        private lateinit var instance: ServiceLocator
        fun init(context: Context) { instance = ServiceLocator(context) }
        fun getInstance(): ServiceLocator = instance
    }
}