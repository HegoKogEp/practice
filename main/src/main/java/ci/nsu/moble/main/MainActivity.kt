package ci.nsu.moble.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.remember
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import ci.nsu.moble.main.data.AppDatabase
import ci.nsu.moble.main.data.DepositRepository
import ci.nsu.moble.main.navigation.Screen
import ci.nsu.moble.main.screens.*
import ci.nsu.moble.main.ui.theme.PracticeTheme
import ci.nsu.moble.main.viewmodels.DepositCalculationViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val database = AppDatabase.getDatabase(this)
        val repository = DepositRepository(database.depositDao())

        setContent {
            PracticeTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = Screen.Main.route) {
                    composable(Screen.Main.route) { MainScreen(navController) }

                    composable(Screen.DepositHistory.route) {
                        DepositHistoryScreen(navController, repository)
                    }

                    navigation(startDestination = Screen.Deposit.route, route = "calc_graph") {
                        composable(Screen.Deposit.route) { backStackEntry ->
                            val parentEntry = remember(backStackEntry) { navController.getBackStackEntry("calc_graph") }
                            val calcVM: DepositCalculationViewModel = viewModel(parentEntry)
                            DepositScreenOne(navController, calcVM)
                        }

                        composable(Screen.ExtraParams.route) { backStackEntry ->
                            val parentEntry = remember(backStackEntry) { navController.getBackStackEntry("calc_graph") }
                            val calcVM: DepositCalculationViewModel = viewModel(parentEntry)
                            DepositScreenTwo(navController, calcVM)
                        }

                        composable(Screen.Result.route) { backStackEntry ->
                            val parentEntry = remember(backStackEntry) { navController.getBackStackEntry("calc_graph") }
                            val calcVM: DepositCalculationViewModel = viewModel(parentEntry)
                            ResultScreen(
                                navController = navController,
                                calcViewModel = calcVM,
                                repository = repository,
                                onSaveComplete = {
                                    navController.navigate(Screen.Main.route) {
                                        popUpTo(Screen.Main.route) { inclusive = false }
                                    }
                                }
                            )
                        }
                    }

                    composable(Screen.HistoryDetail.route) { backStackEntry ->
                        val id = backStackEntry.arguments?.getString("id")?.toLongOrNull() ?: 0L
                        HistoryDetailScreen(navController, id, repository)
                    }
                }
            }
        }
    }
}