package com.mobile.calculations.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.mobile.calculations.ui.navigation.screens.*
import com.mobile.calculations.viewmodels.DepositCalculationViewModel

@Composable
fun CalculationsNavHost(
    navController: NavHostController,
    userId: Long,
    onLogout: () -> Unit,
    calcViewModel: DepositCalculationViewModel
) {
    NavHost(
        navController = navController,
        startDestination = CalculationsScreen.MyCalculations.route
    ) {
        composable(CalculationsScreen.MyCalculations.route) {
            MyCalculationsScreen(onLogout = onLogout, userId = userId)
        }
        navigation(
            startDestination = CalculationsScreen.DepositScreenOne.route,
            route = CalculationsScreen.NewCalculationGraph.route
        ) {
            composable(CalculationsScreen.DepositScreenOne.route) {
                DepositScreenOne(navController = navController, calcViewModel = calcViewModel)
            }
            composable(CalculationsScreen.DepositScreenTwo.route) {
                DepositScreenTwo(navController = navController, calcViewModel = calcViewModel)
            }
            composable(CalculationsScreen.Result.route) {
                ResultScreen(navController = navController, viewModel = calcViewModel, userId = userId)
            }
        }
    }
}