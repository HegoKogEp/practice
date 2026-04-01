package ci.nsu.moble.main.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import ci.nsu.moble.main.navigation.Screen
import ci.nsu.moble.main.viewmodels.DepositViewModel

@Composable
fun DepositScreenOne(
    navController: NavController,
    viewModel: DepositViewModel
) {
    var entryFee by remember { mutableStateOf("") }
    var depositTerm by remember { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Параметры вклада",
            style = MaterialTheme.typography.headlineSmall
        )

        TextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = entryFee,
            onValueChange = {
                entryFee = it
                errorMessage = it
            },
            label = { Text("Стартовый взнос")},
            placeholder = { Text("Введите стартовый взнос") },
            isError = errorMessage.isNotEmpty()

        )

        TextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = depositTerm,
            onValueChange = {
                depositTerm = it
                errorMessage = it
            },
            label = { Text("Срок вклада") },
            placeholder = { Text("Введите срок вклада") },
            isError = errorMessage.isNotEmpty()
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
            horizontalArrangement = Arrangement.Center,
        ) {
            Button(
                onClick = {
                    navController.navigate(Screen.Main.route) {
                        popUpTo(Screen.Main.route) {
                            inclusive = false
                        }
                    }
                },
                modifier = Modifier
                    .weight(1f)
            ) {
                Text("В начало")
            }

            Button(
                onClick = {
                    if (entryFee.isEmpty() || depositTerm.isEmpty()) {
                        errorMessage = "Заполните все поля!"
                    } else {
                      val initialAmount = entryFee.toDoubleOrNull()
                      val period = depositTerm.toIntOrNull()

                      if (initialAmount == null || initialAmount <= 0) {
                          errorMessage = "Сумма взноса введена некорректно"
                      } else if (period == null || period <= 0) {
                          errorMessage = "Срок вклада введен некорректно"
                      } else {
                          viewModel.entryFee = entryFee
                          viewModel.depositTerm = depositTerm
                          navController.navigate(Screen.ExtraParams.route)
                      }
                    }
                },
                modifier = Modifier
                    .weight(1f)
            ) {
                Text("Далее")
            }
        }
    }
}
