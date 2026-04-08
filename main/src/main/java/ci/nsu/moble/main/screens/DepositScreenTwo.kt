package ci.nsu.moble.main.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import ci.nsu.moble.main.navigation.Screen
import ci.nsu.moble.main.viewmodels.DepositCalculationViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DepositScreenTwo(
    navController: NavController,
    calcViewModel: DepositCalculationViewModel
) {
    val state = calcViewModel.state
    var expanded by remember { mutableStateOf(false) }
    var monthlyTopUp by remember { mutableStateOf(state.monthlyTopUp) }
    var errorMessage by remember { mutableStateOf("") }

    val availableRate = calcViewModel.getAvailableRate()
    var selectedRate by remember { mutableStateOf(state.interestRate.takeIf { it > 0 } ?: availableRate) }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text("Дополнительные параметры", style = MaterialTheme.typography.headlineSmall)

        ExposedDropdownMenuBox(expanded = expanded, onExpandedChange = { expanded = it }) {
            TextField(
                value = "${String.format("%.1f", selectedRate)}%",
                onValueChange = {},
                readOnly = true,
                label = { Text("Процентная ставка") },
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded) },
                modifier = Modifier.fillMaxWidth().menuAnchor()
            )
            ExposedDropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
                DropdownMenuItem(
                    text = { Text("$availableRate%") },
                    onClick = { selectedRate = availableRate; expanded = false }
                )
            }
        }

        TextField(
            value = monthlyTopUp,
            onValueChange = { monthlyTopUp = it },
            label = { Text("Ежемесячное пополнение (необязательно)") },
            modifier = Modifier.fillMaxWidth()
        )
        if (errorMessage.isNotEmpty()) {
            Text(errorMessage, color = MaterialTheme.colorScheme.error)
        }

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            Button(onClick = { navController.popBackStack() }, modifier = Modifier.weight(1f)) {
                Text("Назад")
            }
            Button(
                onClick = {
                    val months = state.depositTerm.toIntOrNull()
                    if (months == null || months <= 0) {
                        errorMessage = "Срок вклада некорректен"
                    } else {
                        calcViewModel.setRateAndTopUp(selectedRate, monthlyTopUp)
                        calcViewModel.calculate()
                        navController.navigate(Screen.Result.route)
                    }
                },
                modifier = Modifier.weight(1f)
            ) {
                Text("Рассчитать")
            }
        }
    }
}