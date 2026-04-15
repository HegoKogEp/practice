package ci.nsu.mobile.main.data.state

import ci.nsu.mobile.main.data.dto.model.UserDto

data class MainState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val users: List<UserDto> = emptyList(),
    val shouldNavigateToLogin: Boolean = false
)
