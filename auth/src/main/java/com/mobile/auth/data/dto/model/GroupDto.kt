package com.mobile.auth.data.dto.model

import com.google.gson.annotations.SerializedName

data class GroupDto(
    @SerializedName("groupId")
    val id: Int,
    @SerializedName("groupName")
    val name: String
)