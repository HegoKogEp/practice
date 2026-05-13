package com.mobile.auth.data.network

import com.mobile.auth.data.dto.request.LoginRequest
import com.mobile.auth.data.dto.request.RegisterRequest
import com.mobile.auth.data.dto.model.UserDto
import com.mobile.auth.data.dto.model.GroupDto
import com.mobile.auth.data.dto.response.LoginResponse
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