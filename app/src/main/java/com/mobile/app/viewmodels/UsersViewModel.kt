package com.mobile.app.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.auth.data.repository.AuthRepository
import com.mobile.auth.di.AuthServiceLocator
import com.mobile.app.ui.state.UserState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class UsersViewModel : ViewModel() {
    private val repository: AuthRepository = AuthServiceLocator.getInstance().authRepository

    private val _state = MutableStateFlow(UserState())
    val state: StateFlow<UserState> = _state

    init {
        loadUsers()
    }

    private fun loadUsers() {
        viewModelScope.launch {
            _state.value = _state.value.copy(isLoading = true, error = null)
            repository.getUsers()
                .onSuccess { users ->
                    _state.value = _state.value.copy(isLoading = false, users = users)
                }
                .onFailure { error ->
                    _state.value = _state.value.copy(
                        isLoading = false,
                        error = error.localizedMessage ?: "Не удалось загрузить пользователей"
                    )
                }
        }
    }
}