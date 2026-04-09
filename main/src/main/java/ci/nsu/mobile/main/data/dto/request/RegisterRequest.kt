package ci.nsu.mobile.main.data.dto.request

import ci.nsu.mobile.main.data.dto.model.PersonDto
import com.google.gson.annotations.SerializedName

data class RegisterRequest(
    @SerializedName("login")
    val login: String,
    @SerializedName("password")
    val password: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("phoneNumber")
    val phoneNumber: String,
    @SerializedName("roleId")
    val roleId: Int = 1,
    @SerializedName("authAllowed")
    val authAllowed: Boolean = true,
    @SerializedName("person")
    val person: PersonDto
)