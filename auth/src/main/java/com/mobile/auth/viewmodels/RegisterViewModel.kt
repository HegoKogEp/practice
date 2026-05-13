package com.mobile.auth.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.auth.data.dto.model.PersonDto
import com.mobile.auth.data.dto.request.RegisterRequest
import com.mobile.auth.data.repository.AuthRepository
import com.mobile.auth.data.state.RegisterState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class RegisterViewModel(private val authRepository: AuthRepository) : ViewModel() {
    private val _state = MutableStateFlow(RegisterState())
    val state: StateFlow<RegisterState> = _state

    init { loadGroups() }

    private fun loadGroups() {
        viewModelScope.launch {
            _state.value = _state.value.copy(isLoading = true)
            authRepository.getGroups()
                .onSuccess { groups -> _state.value = _state.value.copy(isLoading = false, groups = groups) }
                .onFailure { error -> _state.value = _state.value.copy(isLoading = false, error = error.localizedMessage) }
        }
    }

    fun registerUser(firstName: String, lastName: String, middleName: String, birthDate: String, gender: String, groupId: Int, login: String, password: String, email: String, phoneNumber: String) {
        viewModelScope.launch {
            _state.value = _state.value.copy(isLoading = true, error = null)
            val person = PersonDto(firstName, lastName, middleName, birthDate, gender, groupId)
            val request = RegisterRequest(login, password, email, phoneNumber, 1, true, person)
            authRepository.registerUser(request)
                .onSuccess { _state.value = _state.value.copy(isLoading = false, isSuccess = true) }
                .onFailure { error -> _state.value = _state.value.copy(isLoading = false, error = error.localizedMessage) }
        }
    }

    fun resetSuccess() { _state.value = _state.value.copy(isSuccess = false) }
}