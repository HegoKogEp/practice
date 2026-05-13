package com.mobile.auth.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.auth.data.repository.AuthRepository
import com.mobile.auth.data.state.LoginState
import com.mobile.auth.impl.AuthManagerImpl   // добавляем импорт
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class LoginViewModel(
    private val authRepository: AuthRepository,
    private val authManager: AuthManagerImpl   // добавили зависимость
) : ViewModel() {
    private val _state = MutableStateFlow(LoginState())
    val state: StateFlow<LoginState> = _state

    fun loginUser(login: String, password: String) {
        viewModelScope.launch {
            _state.value = _state.value.copy(isLoading = true, error = null)
            authRepository.loginUser(login, password)
                .onSuccess { user ->
                    // Обновляем AuthManager
                    authManager.setAuthenticated(user.id.toLong(), user.login)
                    _state.value = _state.value.copy(
                        isLoading = false,
                        isSuccess = true,
                        user = user
                    )
                }
                .onFailure { error ->
                    _state.value = _state.value.copy(
                        isLoading = false,
                        error = error.localizedMessage
                    )
                }
        }
    }

    fun resetSuccess() {
        _state.value = _state.value.copy(isSuccess = false)
    }
}