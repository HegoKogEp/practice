package com.mobile.auth.impl

import com.mobile.auth.data.local.TokenManager
import com.mobile.domain.auth.AuthManager
import com.mobile.domain.auth.AuthState
import com.mobile.domain.auth.User
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow

class AuthManagerImpl : AuthManager {
    private val _authState = MutableStateFlow<AuthState>(
        if (TokenManager.token != null) {
            val userId = TokenManager.userId ?: -1L
            AuthState.Authenticated(User(userId, "", null, null, null))
        } else AuthState.LoggedOut
    )

    override fun getCurrentUser(): User? {
        return if (isLoggedIn()) {
            User(TokenManager.userId ?: -1L, "", null, null, null)
        } else null
    }

    override fun isLoggedIn(): Boolean = TokenManager.token != null

    override fun logout() {
        TokenManager.clearUserData()
        _authState.value = AuthState.LoggedOut
    }

    override fun observeAuthState(): Flow<AuthState> = _authState

    fun setAuthenticated(userId: Long, login: String) {
        val user = User(id = userId, login = login, email = null, firstName = null, lastName = null)
        _authState.value = AuthState.Authenticated(user)
    }
}