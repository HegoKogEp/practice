package ci.nsu.mobile.main.data.repository

import ci.nsu.mobile.main.data.dto.model.GroupDto
import ci.nsu.mobile.main.data.dto.model.UserDto
import ci.nsu.mobile.main.data.dto.request.LoginRequest
import ci.nsu.mobile.main.data.dto.request.RegisterRequest
import ci.nsu.mobile.main.data.local.TokenManager
import ci.nsu.mobile.main.data.network.RetrofitClient
import java.io.IOException

class AuthRepository {
    private val apiService = RetrofitClient.apiService

    suspend fun loginUser(login: String, password: String): Result<UserDto> {
        return try {
            val loginResponse = apiService.login(LoginRequest(login, password))
            TokenManager.token = loginResponse.token

            // Получаем список всех пользователей
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