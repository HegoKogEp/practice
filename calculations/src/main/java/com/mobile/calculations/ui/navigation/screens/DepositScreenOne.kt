package com.mobile.calculations.ui.navigation.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.mobile.calculations.viewmodels.DepositCalculationViewModel

@Composable
fun DepositScreenOne(navController: NavController, calcViewModel: DepositCalculationViewModel) {
    val state by calcViewModel.state.collectAsState()

    var entryFee by remember { mutableStateOf(state.entryFee) }
    var depositTerm by remember { mutableStateOf(state.depositTerm) }
    var errorMessage by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(16.dp)) {
        Text("Параметры вклада", style = MaterialTheme.typography.headlineSmall)
        TextField(value = entryFee, onValueChange = { entryFee = it; errorMessage = "" }, label = { Text("Стартовый взнос") }, modifier = Modifier.fillMaxWidth(), isError = errorMessage.isNotEmpty())
        TextField(value = depositTerm, onValueChange = { depositTerm = it; errorMessage = "" }, label = { Text("Срок вклада (месяцы)") }, modifier = Modifier.fillMaxWidth(), isError = errorMessage.isNotEmpty())
        if (errorMessage.isNotEmpty()) Text(errorMessage, color = MaterialTheme.colorScheme.error)
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            Button(onClick = { navController.popBackStack() }, modifier = Modifier.weight(1f)) { Text("Назад") }
            Button(
                onClick = {
                    when {
                        entryFee.isEmpty() || depositTerm.isEmpty() -> errorMessage = "Заполните все поля"
                        entryFee.toDoubleOrNull() == null || entryFee.toDouble() <= 0 -> errorMessage = "Некорректная сумма"
                        depositTerm.toIntOrNull() == null || depositTerm.toInt() <= 0 -> errorMessage = "Некорректный срок"
                        else -> {
                            calcViewModel.updateInitialParams(entryFee, depositTerm)
                            navController.navigate(CalculationsScreen.DepositScreenTwo.route)
                        }
                    }
                }, modifier = Modifier.weight(1f)
            ) { Text("Далее") }
        }
    }
}