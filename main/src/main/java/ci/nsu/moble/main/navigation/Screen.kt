package ci.nsu.moble.main.navigation

sealed class Screen(val route: String) {
    object Home: Screen("home")
    object ScreenOne: Screen("screen_one")
    object ScreenTwo: Screen("screen_two")
}