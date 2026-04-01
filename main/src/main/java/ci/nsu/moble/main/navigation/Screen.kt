package ci.nsu.moble.main.navigation

sealed class Screen(val route: String) {
    object Main: Screen("main")
    object Deposit: Screen("deposit")
    object DepositHistory: Screen("depositHistory")
    object ExtraParams: Screen("extraParams")
    object Result: Screen("result")
    object HistoryDetail: Screen("historyDetail/{id}") {
        fun passId(id: Long): String = "historyDetail/$id"
    }
}