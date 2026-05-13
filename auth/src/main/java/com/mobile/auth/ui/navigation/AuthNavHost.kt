package com.mobile.auth.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mobile.auth.ui.screens.AuthScreen
import com.mobile.auth.ui.screens.LoginScreen
import com.mobile.auth.ui.screens.RegisterScreen
import com.mobile.domain.auth.AuthNavigator

@Composable
fun AuthNavHost(
    navController: NavHostController,
    authNavigator: AuthNavigator,
    onAuthSuccess: (Long) -> Unit
) {
    NavHost(
        navController = navController,
        startDestination = AuthScreen.Login.route
    ) {
        composable(AuthScreen.Login.route) {
            LoginScreen(
                onLoginSuccess = { userId ->
                    onAuthSuccess(userId)
                },
                onNavigateToRegister = {
                    navController.navigate(AuthScreen.Register.route)
                }
            )
        }
        composable(AuthScreen.Register.route) {
            RegisterScreen(
                onNavigateBack = { navController.popBackStack() }
            )
        }
    }
}