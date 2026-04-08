package ci.nsu.moble.main.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import ci.nsu.moble.main.data.DepositCalculation
import ci.nsu.moble.main.data.DepositRepository
import ci.nsu.moble.main.navigation.Screen
import ci.nsu.moble.main.viewmodels.DepositCalculationViewModel
import ci.nsu.moble.main.viewmodels.HistoryViewModel

@Composable
fun ResultScreen(
    navController: NavController,
    calcViewModel: DepositCalculationViewModel,
    repository: DepositRepository,
    onSaveComplete: () -> Unit
) {
    val s = calcViewModel.state

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text("Результат расчета", fontSize = 24.sp)

        Card(modifier = Modifier.fillMaxWidth(), elevation = CardDefaults.cardElevation(4.dp)) {
            Column(modifier = Modifier.fillMaxWidth().padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
                ResultItem("Стартовый взнос", s.entryFee)
                ResultItem("Срок вклада", s.depositTerm)
                ResultItem("Процентная ставка", "${String.format("%.1f", s.interestRate)}%")
                if (s.monthlyTopUp.isNotEmpty() && s.monthlyTopUp.toDoubleOrNull() != 0.0) {
                    ResultItem("Ежемесячное пополнение", s.monthlyTopUp)
                }
                ResultItem("Итоговая сумма", "%.2f".format(s.finalAmount))
                ResultItem("Начисленные проценты", "%.2f".format(s.interestEarned))
            }
        }

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            Button(
                onClick = {
                    val calculation = DepositCalculation(
                        initialAmount = s.entryFee.toDoubleOrNull() ?: 0.0,
                        periodMonths = s.depositTerm.toIntOrNull() ?: 0,
                        interestRate = s.interestRate,
                        monthlyTopUp = s.monthlyTopUp.toDoubleOrNull(),
                        finalAmount = s.finalAmount,
                        interestEarned = s.interestEarned,
                        calculationDate = System.currentTimeMillis()
                    )
                    val historyVM = HistoryViewModel(repository)
                    historyVM.insertCalculation(calculation)
                    calcViewModel.reset()
                    onSaveComplete()
                },
                modifier = Modifier.weight(1f)
            ) { Text("Сохранить") }

            Button(
                onClick = {
                    calcViewModel.reset()
                    navController.navigate(Screen.Main.route) {
                        popUpTo(Screen.Main.route) { inclusive = false }
                    }
                },
                modifier = Modifier.weight(1f)
            ) { Text("В начало") }
        }
    }
}

@Composable
fun ResultItem(label: String, value: String) {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        Text(text = label)
        Text(text = value)
    }
}