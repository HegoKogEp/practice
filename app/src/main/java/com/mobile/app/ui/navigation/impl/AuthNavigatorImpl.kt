package com.mobile.app.ui.navigation.impl

import android.app.Activity
import android.content.Context
import androidx.navigation.NavHostController
import com.mobile.domain.auth.AuthNavigator

class AuthNavigatorImpl(private val navController: NavHostController) : AuthNavigator {
    override fun navigateToLogin(context: Context) {
        navController.navigate("auth") { popUpTo(0) }
    }

    override fun navigateToRegister(context: Context) {
        navController.navigate("register")
    }

    override fun openAuthFlow(activity: Activity, requestCode: Int) {
        // Запуск отдельного потока аутентификации (не используется)
        navigateToLogin(activity)
    }
}