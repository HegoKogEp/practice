package ci.nsu.mobile.main.data.network

import ci.nsu.mobile.main.data.dto.request.*
import ci.nsu.mobile.main.data.dto.model.*
import ci.nsu.mobile.main.data.dto.response.*
import retrofit2.Response
import retrofit2.http.*

interface ApiService {
    @POST("auth/login")
    suspend fun login(@Body request: LoginRequest) : LoginResponse

    @POST("auth/register")
    suspend fun register(@Body request: RegisterRequest) : Response<Unit>

    @GET("users")
    suspend fun getUsers() : List<UserDto>

    @GET("groups")
    suspend fun getGroups() : List<GroupDto>
}