package com.mobile.app.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.mobile.app.ui.navigation.impl.AuthNavigatorImpl
import com.mobile.app.ui.navigation.impl.CalculationsNavigatorImpl
import com.mobile.app.ui.screens.MainScreen
import com.mobile.auth.data.local.TokenManager
import com.mobile.auth.ui.navigation.AuthNavHost
import com.mobile.calculations.di.CalculationsServiceLocator
import com.mobile.calculations.viewmodels.DepositCalculationViewModel

@Composable
fun AppNavigation() {
    val rootNavController = rememberNavController()
    val startDestination = if (TokenManager.token != null) "main" else "auth"

    NavHost(navController = rootNavController, startDestination = startDestination) {
        composable("auth") {
            val authNavigator = remember { AuthNavigatorImpl(rootNavController) }
            AuthNavHost(
                navController = rememberNavController(),
                authNavigator = authNavigator,
                onAuthSuccess = { userId ->
                    rootNavController.navigate("main/$userId") {
                        popUpTo("auth") { inclusive = true }
                    }
                }
            )
        }

        composable(
            route = "main/{userId}",
            arguments = listOf(navArgument("userId") { type = NavType.LongType })
        ) { backStackEntry ->
            val userId = backStackEntry.arguments?.getLong("userId") ?: 0L
            val calcViewModel: DepositCalculationViewModel = viewModel(
                factory = CalculationsServiceLocator.getInstance().depositCalculationViewModelFactory
            )
            val calculationsNavigator = remember { CalculationsNavigatorImpl(rootNavController, userId) }
            MainScreen(
                userId = userId,
                calcViewModel = calcViewModel,
                calculationsNavigator = calculationsNavigator,
                onLogout = {
                    TokenManager.clearUserData()
                    rootNavController.navigate("auth") {
                        popUpTo("auth") { inclusive = true }
                    }
                }
            )
        }
    }
}