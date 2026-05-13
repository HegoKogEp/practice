package com.mobile.calculations.impl

import android.app.Activity
import android.content.Context
import com.mobile.domain.calculations.CalculationsNavigator

class CalculationsNavigatorImpl : CalculationsNavigator {
    override fun navigateToNewCalculation(context: Context, userId: Long) { /* Реализация */ }
    override fun navigateToMyCalculations(context: Context, userId: Long) { /* Реализация */ }
    override fun openCalculationFlow(activity: Activity, userId: Long) { /* Реализация */ }
}