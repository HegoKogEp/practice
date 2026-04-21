package ci.nsu.mobile.main.ui.navigation

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Register : Screen("register")
    object Main : Screen("main")
    object Users : Screen("users")
    object MyCalculations : Screen("my_calculations")
    object NewCalculationGraph : Screen("new_calc_graph")
    object DepositScreenOne : Screen("deposit_one")
    object DepositScreenTwo : Screen("deposit_two")
    object Result : Screen("result")
}