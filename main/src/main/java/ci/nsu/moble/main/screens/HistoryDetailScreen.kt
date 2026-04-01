package ci.nsu.moble.main.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import ci.nsu.moble.main.data.DepositCalculation
import ci.nsu.moble.main.data.DepositRepository
import ci.nsu.moble.main.viewmodels.HistoryViewModel
import kotlinx.coroutines.runBlocking
import java.text.SimpleDateFormat
import java.util.Locale

@Composable
fun HistoryDetailScreen(
    navController: NavController,
    id: Long,
    repository: DepositRepository
) {
    val viewModel = remember { HistoryViewModel(repository) }
    var calculation by remember { mutableStateOf<DepositCalculation?>(null) }

    runBlocking {
        if (calculation == null) {
            calculation = viewModel.getCalculationById(id)
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Детальная информация",
            style = MaterialTheme.typography.headlineMedium
        )

        calculation?.let { calc ->
            Card(
                modifier = Modifier
                    .fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Text(
                        text = SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.getDefault())
                            .format(calc.calculationDate),
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.primary
                    )
                    DetailItem("Стартовый взнос", calc.initialAmount.toString())
                    DetailItem("Срок вклада", calc.periodMonths.toString())
                    DetailItem("Процентная ставка", calc.interestRate.toString())

                    if (calc.monthlyTopUp != null && calc.monthlyTopUp > 0) {
                        DetailItem("Ежемесячное пополнение", calc.monthlyTopUp.toString())
                    }

                    DetailItem("Итоговая сумма", calc.finalAmount.toString())
                    DetailItem("Начисленные проценты", calc.interestEarned.toString())
                }
            }
        }
    }
}

@Composable
fun DetailItem(
    label: String,
    value: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodyMedium
        )
        Text(
            text = value,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.primary
        )
    }
}
