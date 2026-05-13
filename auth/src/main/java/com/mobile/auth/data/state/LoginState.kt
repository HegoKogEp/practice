package com.mobile.auth.data.state

import com.mobile.auth.data.dto.model.UserDto

data class LoginState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val isSuccess: Boolean = false,
    val user: UserDto? = null
)