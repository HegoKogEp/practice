package ci.nsu.moble.data

data class CounterUiState(
    val count: Int = 0,
    val history: List<String> = emptyList()
)