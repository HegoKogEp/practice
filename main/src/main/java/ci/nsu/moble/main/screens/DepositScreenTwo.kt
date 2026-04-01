package ci.nsu.moble.main.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import ci.nsu.moble.main.navigation.Screen
import ci.nsu.moble.main.viewmodels.ExtraParamsViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DepositScreenTwo(
    navController: NavController,
    viewModel: ExtraParamsViewModel,
    initialAmount: Double,
    periodMonths: Int
) {
    viewModel.entryFee = initialAmount
    viewModel.depositTerm = periodMonths

    var expanded by remember { mutableStateOf(false) }
    var monthlyTopUp by remember { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf("") }

    val avaibleRate = viewModel.calculateAvaibleRates()
    var selectedRate by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        Text(
            text = "Дополнительные параметры"
        )

        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = { expanded = it }
        ) {
            TextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = "$selectedRate%",
                onValueChange = { },
                readOnly = true,
                label = { Text(
                    text = "Процентная ставка",
                )}
            )

            ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                DropdownMenuItem(
                    text = { Text(
                        text = "$avaibleRate%"
                    )},
                    onClick = {
                        selectedRate = avaibleRate.toString()
                        expanded = true
                    }
                )
            }

            TextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = monthlyTopUp,
                onValueChange = {
                    monthlyTopUp = it
                    viewModel.monthlyTopUp = it
                },
                label = {
                    Text(
                        text = "Ежемесячное пополнение(необязятельно)"
                    )
                },
                placeholder = {
                    Text(
                        text = "Введите сумму пополнения"
                    )
                }
            )

            if (errorMessage.isNotEmpty()) {
                Text(
                    text = errorMessage,
                    color = MaterialTheme.colorScheme.error
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Button(
                    onClick = {
                        navController.popBackStack()
                    },
                    modifier = Modifier
                        .weight(1f)
                ) {
                    Text(
                        text = "Назад"
                    )
                }

                Button(
                    onClick = {
                        if (periodMonths < 0) {
                            errorMessage = "Срок вклада не указан"
                        } else {
                            viewModel.selectedRate = selectedRate.toDouble()
                            viewModel.monthlyTopUp = monthlyTopUp

                            val (finalAmount, interestEarned) = viewModel.calculateResult()

                            navController.navigate(
                                Screen.Result.route +
                                        "?initialAmount=$initialAmount" +
                                        "&periodMonths=$periodMonths" +
                                        "&interestRate=$selectedRate" +
                                        "&monthlyTopUp=${monthlyTopUp.toDoubleOrNull() ?: 0.0}" +
                                        "&finalAmount=$finalAmount" +
                                        "&interestEarned=$interestEarned"
                            )
                        }
                    },
                    modifier = Modifier
                        .weight(1f)
                ) {
                    Text(
                        text = "Рассчитать"
                    )
                }
            }
        }
    }
}