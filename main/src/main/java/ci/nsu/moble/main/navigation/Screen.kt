package ci.nsu.moble.main.navigation

sealed class Screen(val route: String) {
    object Main: Screen("main")
    object Deposit: Screen("deposit")
    object DepositHistory: Screen("depositHistory")
}