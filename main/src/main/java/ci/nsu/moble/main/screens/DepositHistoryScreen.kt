package ci.nsu.moble.main.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import ci.nsu.moble.main.data.DepositCalculation
import ci.nsu.moble.main.data.DepositRepository
import ci.nsu.moble.main.navigation.Screen
import ci.nsu.moble.main.viewmodels.HistoryViewModel
import java.text.SimpleDateFormat
import java.util.Locale

@Composable
fun DepositHistoryScreen(
    navController: NavController,
    repository: DepositRepository
) {
    val viewModel = remember { HistoryViewModel(repository) }
    val calculations by viewModel.calculations.collectAsState(initial = emptyList())

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            text = "История расчетов",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        if (calculations.isEmpty()) {
            Text(
                text = "История расчетов пуста",
                modifier = Modifier.fillMaxWidth(),
                style = MaterialTheme.typography.bodyLarge
            )
        } else {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(calculations) { calculation ->
                    HistoryItem(
                        calculation = calculation,
                        onClick = {
                            navController.navigate(Screen.HistoryDetail.passId(calculation.id))
                        }
                    )
                }
            }
        }

        Button(
            onClick = { navController.popBackStack() },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        ) {
            Text("Назад")
        }
    }
}

@Composable
fun HistoryItem(
    calculation: DepositCalculation,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        ) {
            Text(
                text = SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.getDefault())
                    .format(calculation.calculationDate),
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.primary
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("Стартовый взнос: ", style = MaterialTheme.typography.bodyMedium)
                Text(
                    text = "%.2f".format(calculation.initialAmount),
                    style = MaterialTheme.typography.bodyMedium
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("Итоговая сумма: ", style = MaterialTheme.typography.bodyMedium)
                Text(
                    text = "%.2f".format(calculation.finalAmount),
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.primary
                )
            }
        }
    }
}