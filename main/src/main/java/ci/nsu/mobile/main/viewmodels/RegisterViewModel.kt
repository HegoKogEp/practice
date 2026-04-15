package ci.nsu.mobile.main.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ci.nsu.mobile.main.data.dto.model.PersonDto
import ci.nsu.mobile.main.data.dto.request.RegisterRequest
import ci.nsu.mobile.main.data.repository.AuthRepository
import ci.nsu.mobile.main.data.state.RegisterState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class RegisterViewModel : ViewModel() {
    private val _repository = AuthRepository()

    private val _state = MutableStateFlow(RegisterState())
    val state: StateFlow<RegisterState> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = _state.value.copy(
                isLoading = true
            )

            _repository.getGroups()
                .onSuccess { groups ->
                    _state.value = _state.value.copy(
                        isLoading = false,
                        groups = groups
                    )
                }
                .onFailure { error ->
                    _state.value = _state.value.copy(
                        isLoading = false,
                        error = "Failed to load groups: ${error.localizedMessage}"
                    )
                }
        }
    }

    fun registerUser(
        firstName: String,
        lastName: String,
        middleName: String,
        birthDate: String,
        gender: String,
        groupId: Int,
        login: String,
        password: String,
        email: String,
        phoneNumber: String
    ) {
        viewModelScope.launch {
            _state.value = _state.value.copy(
                isLoading = true
            )

            val person = PersonDto(
                firstName = firstName,
                lastName = lastName,
                middleName = middleName,
                birthDate = birthDate,
                gender = gender,
                groupId = groupId
            )

            val request = RegisterRequest(
                login = login,
                password = password,
                email = email,
                phoneNumber = phoneNumber,
                roleId = 1,
                authAllowed = true,
                person = person
            )

            _repository.registerUser(request)
                .onSuccess {
                    _state.value = _state.value.copy(
                        isLoading = false,
                        isSuccess = true
                    )
                }
                .onFailure { error ->
                   _state.value = _state.value.copy(
                       isSuccess = false,
                       error = error.localizedMessage ?: "Registration Failed"
                   )
                }
        }
    }

    fun clearError() {
        _state.value = _state.value.copy(
            error = null
        )
    }
}