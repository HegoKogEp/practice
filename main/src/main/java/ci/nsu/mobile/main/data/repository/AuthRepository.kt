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

    suspend fun loginUser(login: String, password: String) : Result<UserDto> {
        return try {
            val response = apiService.login(LoginRequest(login, password))
            TokenManager.token = response.token
            Result.success(response.user)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun registerUser (request: RegisterRequest) : Result<Unit> {
        return try {
            val response = apiService.register(request)
            if (response.isSuccessful) {
                Result.success(Unit)
            } else {
                Result.failure(IOException("Registration failed: ${response.code()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun getUsers() : Result<List<UserDto>> {
        return try {
            val users = apiService.getUsers()
            Result.success(users)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun getGroups() : Result<List<GroupDto>> {
        return try {
            val groups = apiService.getGroups()
            Result.success(groups)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

}