package ci.nsu.mobile.main.viewmodels

import androidx.lifecycle.SAVED_STATE_REGISTRY_OWNER_KEY
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ci.nsu.mobile.main.data.local.TokenManager
import ci.nsu.mobile.main.data.repository.AuthRepository
import ci.nsu.mobile.main.data.state.MainState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val _repository = AuthRepository()

    private val _state = MutableStateFlow(MainState())
    val state: StateFlow<MainState> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = _state.value.copy(
                isLoading = true
            )

            _repository.getUsers()
                .onSuccess { users ->
                    _state.value = _state.value.copy(
                        isLoading = false,
                        users = users
                    )
                }
                .onFailure { error ->
                    _state.value = _state.value.copy(
                        isLoading = false,
                        error = error.localizedMessage ?: "Failed to load users"
                    )
                }
        }
    }

    fun logout() {
        TokenManager.clearToken()
        _state.value = _state.value.copy(
            shouldNavigateToLogin = true
        )
    }

    fun resetNavigation() {
        _state.value = _state.value.copy(
            shouldNavigateToLogin = false
        )
    }
}