package ci.nsu.mobile.main.data.dto.model

import com.google.gson.annotations.SerializedName

data class UserDto(
    @SerializedName("id")
    val id: Int,
    @SerializedName("login")
    val login: String,
    @SerializedName("email")
    val email: String?,
    @SerializedName("person")
    val person: PersonDto?
)