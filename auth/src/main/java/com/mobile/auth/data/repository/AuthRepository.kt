package com.mobile.auth.data.repository

import com.mobile.auth.data.dto.model.GroupDto
import com.mobile.auth.data.dto.model.UserDto
import com.mobile.auth.data.dto.request.LoginRequest
import com.mobile.auth.data.dto.request.RegisterRequest
import com.mobile.auth.data.local.TokenManager
import com.mobile.auth.data.network.RetrofitClient
import java.io.IOException

class AuthRepository {
    private val apiService = RetrofitClient.apiService

    suspend fun loginUser(login: String, password: String): Result<UserDto> {
        return try {
            val loginResponse = apiService.login(LoginRequest(login, password))
            TokenManager.token = loginResponse.token

            val allUsers = apiService.getUsers()
            val currentUser = allUsers.find { it.login == login }
                ?: throw IOException("User not found in users list")

            TokenManager.userId = currentUser.id.toLong()
            Result.success(currentUser)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun registerUser(request: RegisterRequest): Result<Unit> {
        return try {
            val response = apiService.register(request)
            if (response.isSuccessful) Result.success(Unit)
            else Result.failure(IOException("Registration failed: ${response.code()}"))
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun getUsers(): Result<List<UserDto>> {
        return try {
            Result.success(apiService.getUsers())
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun getGroups(): Result<List<GroupDto>> {
        return try {
            Result.success(apiService.getGroups())
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}