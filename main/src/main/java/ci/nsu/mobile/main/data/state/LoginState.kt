package ci.nsu.mobile.main.data.state

import ci.nsu.mobile.main.data.dto.model.UserDto

data class LoginState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val isSuccess: Boolean = false,
    val user: UserDto? = null
)