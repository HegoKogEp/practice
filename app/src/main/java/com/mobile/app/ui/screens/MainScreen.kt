package com.mobile.app.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.mobile.auth.ui.*
import com.mobile.calculations.ui.*
import com.mobile.calculations.ui.navigation.*
import com.mobile.calculations.ui.navigation.screens.*
import com.mobile.calculations.viewmodels.DepositCalculationViewModel
import com.mobile.domain.calculations.CalculationsNavigator

@Composable
fun MainScreen(
    userId: Long,
    calcViewModel: DepositCalculationViewModel,
    calculationsNavigator: CalculationsNavigator,
    onLogout: () -> Unit
) {
    val innerNavController = rememberNavController()

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
            startDestination = CalculationsScreen.MyCalculations.route,
            modifier = Modifier.padding(padding)
        ) {
            composable(CalculationsScreen.MyCalculations.route) {
                MyCalculationsScreen(
                    onLogout = onLogout,
                    userId = userId
                )
            }
            composable(BottomNavItem.Users.route) {
                UsersScreen()
            }
            navigation(
                startDestination = CalculationsScreen.DepositScreenOne.route,
                route = BottomNavItem.NewCalculation.route
            ) {
                composable(CalculationsScreen.DepositScreenOne.route) {
                    DepositScreenOne(
                        navController = innerNavController,
                        calcViewModel = calcViewModel
                    )
                }
                composable(CalculationsScreen.DepositScreenTwo.route) {
                    DepositScreenTwo(
                        navController = innerNavController,
                        calcViewModel = calcViewModel
                    )
                }
                composable(CalculationsScreen.Result.route) {
                    ResultScreen(
                        navController = innerNavController,
                        viewModel = calcViewModel,
                        userId = userId
                    )
                }
            }
        }
    }
}

sealed class BottomNavItem(val route: String, val title: String, val icon: ImageVector) {
    object Users : BottomNavItem("users", "Пользователи", Icons.Default.Person)
    object MyCalculations : BottomNavItem(
        CalculationsScreen.MyCalculations.route,
        "Мои расчёты",
        Icons.AutoMirrored.Filled.List
    )
    object NewCalculation : BottomNavItem(
        "new_calculation",
        "Новый расчёт",
        Icons.Default.Add
    )
}