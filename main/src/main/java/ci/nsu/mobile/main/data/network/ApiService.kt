package ci.nsu.mobile.main.data.network

import ci.nsu.mobile.main.data.dto.request.LoginRequest
import ci.nsu.mobile.main.data.dto.request.RegisterRequest
import ci.nsu.mobile.main.data.dto.model.UserDto
import ci.nsu.mobile.main.data.dto.model.GroupDto
import ci.nsu.mobile.main.data.dto.response.LoginResponse
import retrofit2.Response
import retrofit2.http.*

interface ApiService {
    @POST("auth/login")
    suspend fun login(@Body request: LoginRequest): LoginResponse

    @POST("auth/register")
    suspend fun register(@Body request: RegisterRequest): Response<Unit>

    @GET("users")
    suspend fun getUsers(): List<UserDto>

    @GET("groups")
    suspend fun getGroups(): List<GroupDto>
}