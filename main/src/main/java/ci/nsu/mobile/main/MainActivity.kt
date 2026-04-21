package ci.nsu.mobile.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import ci.nsu.mobile.main.data.local.TokenManager
import ci.nsu.mobile.main.di.ServiceLocator
import ci.nsu.mobile.main.ui.navigation.AppNavigation
import ci.nsu.mobile.main.ui.theme.PracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        TokenManager.init(applicationContext)
        ServiceLocator.init(applicationContext)   // инициализация ServiceLocator

        setContent {
            PracticeTheme {
                AppNavigation()
            }
        }
    }
}