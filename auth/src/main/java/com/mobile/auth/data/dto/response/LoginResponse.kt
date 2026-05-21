package com.mobile.auth.data.dto.response

import com.google.gson.annotations.SerializedName
import com.mobile.auth.data.dto.model.UserDto

data class LoginResponse(
    @SerializedName("token")
    val token: String
)