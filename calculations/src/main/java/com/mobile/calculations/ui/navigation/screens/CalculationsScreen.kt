package com.mobile.calculations.ui.navigation.screens

sealed class CalculationsScreen(val route: String) {
    object MyCalculations : CalculationsScreen("my_calculations")
    object NewCalculationGraph : CalculationsScreen("new_calc_graph")
    object DepositScreenOne : CalculationsScreen("deposit_one")
    object DepositScreenTwo : CalculationsScreen("deposit_two")
    object Result : CalculationsScreen("result")
}