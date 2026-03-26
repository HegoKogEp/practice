package ci.nsu.moble.main.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
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

@Composable
@Preview(showBackground = true)
fun DepositScreenOne() {
    var entryFee by remember { mutableStateOf("") }
    var depositTerm by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            TextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = entryFee,
                onValueChange = { entryFee = it },
                label = { Text("Стартовый взнос")},
                placeholder = { Text("Введите стартовый взнос") }
            )

            TextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = depositTerm,
                onValueChange = { depositTerm = it },
                label = { Text("Срок вклада") },
                placeholder = { Text("Введите срок вклада") }
            )

        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom
        ) {
            Button(
                onClick = { }
            ) {
                Text("В начало")
            }

            Button(
                onClick = { }
            ) {
                Text("Далее")
            }
        }
    }
}
