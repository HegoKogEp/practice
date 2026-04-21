package ci.nsu.mobile.main.data.state

import ci.nsu.mobile.main.data.dto.model.GroupDto

data class RegisterState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val isSuccess: Boolean = false,
    val groups: List<GroupDto> = emptyList()
)