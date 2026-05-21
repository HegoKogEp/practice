package com.mobile.app.ui.state

import com.mobile.auth.data.dto.model.UserDto

data class UserState(
    val isLoading: Boolean = false,
    val users: List<UserDto> = emptyList(),
    val error: String? = null
)
