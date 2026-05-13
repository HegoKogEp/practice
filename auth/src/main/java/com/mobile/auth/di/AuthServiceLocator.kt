package com.mobile.auth.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mobile.auth.data.repository.AuthRepository
import com.mobile.auth.impl.AuthManagerImpl
import com.mobile.auth.viewmodels.LoginViewModel
import com.mobile.auth.viewmodels.RegisterViewModel

class AuthServiceLocator {
    val authRepository: AuthRepository by lazy { AuthRepository() }
    val authManager: AuthManagerImpl by lazy { AuthManagerImpl() }

    val viewModelFactory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return when {
                modelClass.isAssignableFrom(LoginViewModel::class.java) ->
                    LoginViewModel(authRepository, authManager) as T
                modelClass.isAssignableFrom(RegisterViewModel::class.java) ->
                    RegisterViewModel(authRepository) as T
                else -> throw IllegalArgumentException("Unknown ViewModel class")
            }
        }
    }

    companion object {
        private lateinit var instance: AuthServiceLocator
        fun init() { instance = AuthServiceLocator() }
        fun getInstance(): AuthServiceLocator = instance
    }
}