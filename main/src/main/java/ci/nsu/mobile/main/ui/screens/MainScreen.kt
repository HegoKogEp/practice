package ci.nsu.mobile.main.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import ci.nsu.mobile.main.di.ServiceLocator
import ci.nsu.mobile.main.ui.navigation.Screen
import ci.nsu.mobile.main.viewmodels.DepositCalculationViewModel

@Composable
fun MainScreen(
    rootNavController: NavHostController,
    onLogout: () -> Unit
) {
    val innerNavController = rememberNavController()

    val calcViewModel: DepositCalculationViewModel = viewModel(
        factory = ServiceLocator.getInstance().viewModelFactory
    )

    val bottomNavItems = listOf(
        BottomNavItem.Users,
        BottomNavItem.MyCalculations,
        BottomNavItem.NewCalculation
    )

    Scaffold(
        bottomBar = {
            NavigationBar {
                val navBackStackEntry by innerNavController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route
                bottomNavItems.forEach { item ->
                    NavigationBarItem(
                        selected = currentRoute == item.route,
                        onClick = { innerNavController.navigate(item.route) },
                        icon = { Icon(item.icon, contentDescription = item.title) },
                        label = { Text(item.title) }
                    )
                }
            }
        }
    ) { padding ->
        NavHost(
            navController = innerNavController,
            startDestination = Screen.Users.route,
            modifier = Modifier.padding(padding)
        ) {
            composable(Screen.Users.route) { UsersScreen() }
            composable(Screen.MyCalculations.route) {
                MyCalculationsScreen(onLogout = onLogout)
            }
            navigation(
                startDestination = Screen.DepositScreenOne.route,
                route = Screen.NewCalculationGraph.route
            ) {
                composable(Screen.DepositScreenOne.route) {
                    DepositScreenOne(
                        navController = innerNavController,
                        calcViewModel = calcViewModel
                    )
                }
                composable(Screen.DepositScreenTwo.route) {
                    DepositScreenTwo(
                        navController = innerNavController,
                        calcViewModel = calcViewModel
                    )
                }
                composable(Screen.Result.route) {
                    ResultScreen(
                        navController = innerNavController,
                        viewModel = calcViewModel
                    )
                }
            }
        }
    }
}

sealed class BottomNavItem(val route: String, val title: String, val icon: ImageVector) {
    object Users : BottomNavItem(Screen.Users.route, "Пользователи", Icons.Default.Person)
    object MyCalculations : BottomNavItem(
        Screen.MyCalculations.route,
        "Мои расчёты",
        Icons.AutoMirrored.Filled.List
    )
    object NewCalculation : BottomNavItem(
        Screen.NewCalculationGraph.route,
        "Новый расчёт",
        Icons.Default.Add
    )
}