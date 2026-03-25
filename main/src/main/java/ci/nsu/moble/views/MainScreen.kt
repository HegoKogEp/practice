package ci.nsu.moble.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import ci.nsu.moble.viewmodels.CounterViewModel
import ci.nsu.moble.data.CounterUiState
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun MyScreen(
    viewModel: CounterViewModel = viewModel(), modifier: Modifier
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = "Счетчик: ${uiState.count}",
            fontSize = 32.sp
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Button(
                onClick = { viewModel.increment() }
            ) {
                Text("Увеличить")
            }

            Button(
                onClick = { viewModel.decrement() }
            ) {
                Text("Уменьшить")
            }

            Button(
                onClick = { viewModel.reset() }
            ) {
                Text("Сбросить")
            }
        }

        Text(
            text = "История:",
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 16.dp)
        )

        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            items(uiState.history) { item ->
                Text(
                    text = item,
                    modifier = Modifier.padding(4.dp),
                    fontSize = 14.sp
                )
            }
        }
    }
}

@Composable
@Preview
fun MyScreenPreview(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = "Счетчик: ${5}",
            fontSize = 32.sp
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Button(
                onClick = {  }
            ) {
                Text("Увеличить")
            }

            Button(
                onClick = {  }
            ) {
                Text("Уменьшить")
            }

            Button(
                onClick = {  }
            ) {
                Text("Сбросить")
            }
        }

        Text(
            text = "История:",
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 16.dp)
        )


    }
}
