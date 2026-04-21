package ci.nsu.mobile.main.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import ci.nsu.mobile.main.di.ServiceLocator
import ci.nsu.mobile.main.ui.navigation.Screen
import ci.nsu.mobile.main.viewmodels.DepositCalculationViewModel
import kotlinx.coroutines.launch

@Composable
fun ResultScreen(
    navController: NavController,
    viewModel: DepositCalculationViewModel = viewModel(factory = ServiceLocator.getInstance().viewModelFactory)
) {
    val state = viewModel.state
    val scope = rememberCoroutineScope()
    var saveError by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text("Результат расчета", style = MaterialTheme.typography.headlineSmall)
        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                ResultItem("Стартовый взнос", state.entryFee)
                ResultItem("Срок (мес)", state.depositTerm)
                ResultItem("Ставка", "${state.interestRate}%")
                if (state.monthlyTopUp.isNotEmpty()) ResultItem("Пополнение", state.monthlyTopUp)
                ResultItem("Итоговая сумма", "%.2f".format(state.finalAmount))
                ResultItem("Начислено", "%.2f".format(state.interestEarned))
            }
        }
        if (saveError) {
            Text("Ошибка сохранения. Авторизуйтесь заново.", color = MaterialTheme.colorScheme.error)
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            Button(
                onClick = {
                    scope.launch {
                        if (viewModel.saveCalculation()) {
                            viewModel.reset()
                            navController.popBackStack(Screen.NewCalculationGraph.route, inclusive = true)
                            navController.navigate(Screen.MyCalculations.route)
                        } else {
                            saveError = true
                        }
                    }
                },
                modifier = Modifier.weight(1f)
            ) { Text("Сохранить") }
            Button(
                onClick = {
                    viewModel.reset()
                    navController.popBackStack()
                },
                modifier = Modifier.weight(1f)
            ) { Text("Назад") }
        }
    }
}

@Composable
fun ResultItem(label: String, value: String) {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        Text(label, style = MaterialTheme.typography.bodyMedium)
        Text(value, style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.primary)
    }
}