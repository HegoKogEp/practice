package com.mobile.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.mobile.app.ui.theme.AppTheme
import com.mobile.app.ui.navigation.AppNavigation
import com.mobile.auth.data.local.TokenManager
import com.mobile.auth.di.AuthServiceLocator
import com.mobile.calculations.di.CalculationsServiceLocator

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        TokenManager.init(applicationContext)
        AuthServiceLocator.init()
        CalculationsServiceLocator.init(applicationContext)

        setContent {
            AppTheme {
                AppNavigation()
            }
        }
    }
}