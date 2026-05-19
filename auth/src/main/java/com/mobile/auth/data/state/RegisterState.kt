package com.mobile.auth.data.state

import com.mobile.auth.data.dto.model.GroupDto

data class RegisterState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val isSuccess: Boolean = false,
    val groups: List<GroupDto> = emptyList()
)