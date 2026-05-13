package com.mobile.app.ui.navigation.impl

import android.app.Activity
import android.content.Context
import androidx.navigation.NavHostController
import com.mobile.domain.calculations.CalculationsNavigator

class CalculationsNavigatorImpl(
    private val navController: NavHostController,
    private val userId: Long
) : CalculationsNavigator {
    override fun navigateToNewCalculation(context: Context, userId: Long) {
        navController.navigate("new_calculation")
    }

    override fun navigateToMyCalculations(context: Context, userId: Long) {
        navController.navigate("my_calculations")
    }

    override fun openCalculationFlow(activity: Activity, userId: Long) {
        navigateToNewCalculation(activity, userId)
    }
}