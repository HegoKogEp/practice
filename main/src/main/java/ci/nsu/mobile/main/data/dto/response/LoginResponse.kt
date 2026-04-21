package ci.nsu.mobile.main.data.dto.response

import ci.nsu.mobile.main.data.dto.model.UserDto
import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("token")
    val token: String,
    @SerializedName("user")
    val user: UserDto
)