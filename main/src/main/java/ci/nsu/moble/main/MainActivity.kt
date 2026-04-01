package ci.nsu.moble.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ci.nsu.moble.main.data.AppDatabase
import ci.nsu.moble.main.data.DepositCalculation
import ci.nsu.moble.main.data.DepositRepository
import ci.nsu.moble.main.navigation.Screen
import ci.nsu.moble.main.ui.theme.PracticeTheme
import ci.nsu.moble.main.screens.MainScreen
import ci.nsu.moble.main.screens.DepositScreenOne
import ci.nsu.moble.main.screens.DepositScreenTwo
import ci.nsu.moble.main.screens.HistoryDetailScreen
import ci.nsu.moble.main.screens.ResultScreen
import ci.nsu.moble.main.viewmodels.DepositViewModel
import ci.nsu.moble.main.viewmodels.ExtraParamsViewModel
import ci.nsu.moble.main.viewmodels.HistoryViewModel
import ci.nsu.moble.main.viewmodels.MainViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val database = AppDatabase.getDatabase(this)
        val repository = DepositRepository(database.depositDao())

        setContent {
            PracticeTheme {
                val navController = rememberNavController()
                val mainViewModel = remember { MainViewModel() }
                val depositViewModel = remember { DepositViewModel() }
                val extraParamsViewModel = remember { ExtraParamsViewModel() }

                NavHost(
                    navController = navController,
                    startDestination = Screen.Main.route
                ) {
                    composable(Screen.Main.route) {
                        MainScreen(navController = navController)
                    }

                    composable(Screen.Deposit.route) {
                        DepositScreenOne(
                            navController = navController,
                            viewModel = depositViewModel
                        )
                    }

                    composable(Screen.ExtraParams.route) {
                        val initialAmount = depositViewModel.entryFee.toDoubleOrNull() ?: 0.0
                        val periodMonths = depositViewModel.depositTerm.toIntOrNull() ?: 0

                        DepositScreenTwo(
                            navController = navController,
                            viewModel = extraParamsViewModel,
                            initialAmount = initialAmount,
                            periodMonths = periodMonths
                        )
                    }

                    composable(Screen.Result.route) { backStackEntry ->
                        val initialAmount = backStackEntry
                            .arguments?.getString("initialAmount")?.toDoubleOrNull() ?: 0.0
                        val periodMonths = backStackEntry
                            .arguments?.getString("periodMonths")?.toIntOrNull() ?: 0
                        val interestRate = backStackEntry
                            .arguments?.getString("interestRate")?.toDoubleOrNull() ?: 0.0
                        val monthlyTopUp = backStackEntry
                            .arguments?.getString("monthlyTopUp")?.toDoubleOrNull() ?: 0.0
                        val finalAmount = backStackEntry
                            .arguments?.getString("finalAmount")?.toDoubleOrNull() ?: 0.0
                        val interestEarned = backStackEntry
                            .arguments?.getString("interestEarned")?.toDoubleOrNull() ?: 0.0

                        ResultScreen(
                            navController = navController,
                            initialAmount = initialAmount,
                            periodMonths = periodMonths,
                            interestRate = interestRate,
                            monthlyTopUp = monthlyTopUp,
                            finalAmount = finalAmount,
                            interestEarned = interestEarned,
                            onSave = {
                                val calculation = DepositCalculation(
                                    initialAmount = initialAmount,
                                    periodMonths = periodMonths,
                                    interestRate = interestRate,
                                    monthlyTopUp = monthlyTopUp,
                                    finalAmount = finalAmount,
                                    interestEarned = interestEarned,
                                    calculationDate = System.currentTimeMillis()
                                )

                                val historyViewModel = HistoryViewModel(repository)

                                historyViewModel.insertCalculation(calculation)

                                navController.navigate(Screen.Main.route) {
                                    popUpTo(Screen.Main.route) { inclusive = false }
                                }
                            }
                        )
                    }

                    composable(Screen.HistoryDetail.route) { backStackEntry ->
                        val id = backStackEntry
                            .arguments?.getString("id")?.toLongOrNull() ?: 0L

                        HistoryDetailScreen(
                            navController = navController,
                            id = id,
                            repository = repository
                        )
                    }
                }
            }
        }
    }
}

