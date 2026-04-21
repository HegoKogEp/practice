package ci.nsu.mobile.main.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import ci.nsu.mobile.main.di.ServiceLocator
import ci.nsu.mobile.main.viewmodels.HistoryViewModel
import java.text.SimpleDateFormat
import java.util.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyCalculationsScreen(
    onLogout: () -> Unit,
    viewModel: HistoryViewModel = viewModel(factory = ServiceLocator.getInstance().viewModelFactory)
) {
    val calculations by viewModel.calculations.collectAsState(initial = emptyList())
    var filterText by remember { mutableStateOf("") }
    val filtered = calculations.filter {
        it.initialAmount.toString().contains(filterText) ||
                it.finalAmount.toString().contains(filterText) ||
                it.interestRate.toString().contains(filterText)
    }

    Column {
        TopAppBar(title = { Text("Мои расчёты") }, actions = {
            TextButton(onClick = onLogout) { Text("Выйти") }
        })
        TextField(
            value = filterText, onValueChange = { filterText = it },
            label = { Text("Фильтр (сумма, проценты)") },
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        )
        LazyColumn {
            items(filtered) { calc ->
                Card(modifier = Modifier.fillMaxWidth().padding(8.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(12.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column {
                            Text("Старт: ${calc.initialAmount}", style = MaterialTheme.typography.bodyMedium)
                            Text("Итог: ${calc.finalAmount}", style = MaterialTheme.typography.bodyMedium)
                            Text(SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).format(calc.calculationDate))
                        }
                        IconButton(onClick = { viewModel.deleteCalculation(calc.id) }) {
                            Icon(Icons.Default.Delete, contentDescription = "Удалить")
                        }
                    }
                }
            }
        }
    }
}