package com.mobile.domain.auth

data class User(
    val id: Long,
    val login: String,
    val email: String?,
    val firstName: String?,
    val lastName: String?
)