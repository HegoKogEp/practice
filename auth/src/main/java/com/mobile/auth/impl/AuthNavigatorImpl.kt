package com.mobile.auth.impl

import android.app.Activity
import android.content.Context
import android.content.Intent
import com.mobile.domain.auth.AuthNavigator

class AuthNavigatorImpl : AuthNavigator {
    override fun navigateToLogin(context: Context) {
        // Реализация навигации через Intent или навигационный граф
    }

    override fun navigateToRegister(context: Context) {
        // Реализация навигации
    }

    override fun openAuthFlow(activity: Activity, requestCode: Int) {
        // Запуск аутентификации как результата
    }
}