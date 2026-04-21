package ci.nsu.mobile.main.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import ci.nsu.mobile.main.di.ServiceLocator
import ci.nsu.mobile.main.viewmodels.UsersViewModel

@Composable
fun UsersScreen(viewModel: UsersViewModel = viewModel(factory = ServiceLocator.getInstance().viewModelFactory)) {
    val users by viewModel.users.collectAsState()
    val isLoading by viewModel.isLoading.collectAsState()
    val error by viewModel.error.collectAsState()

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        when {
            isLoading -> CircularProgressIndicator()
            error != null -> Text("Ошибка: $error")
            users.isEmpty() -> Text("Нет пользователей")
            else -> LazyColumn {
                items(users) { user ->
                    Card(modifier = Modifier.fillMaxWidth().padding(8.dp)) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(user.login, style = MaterialTheme.typography.titleMedium)
                            user.email?.let { Text(it, style = MaterialTheme.typography.bodySmall) }
                            user.person?.let { p ->
                                Text("${p.firstName} ${p.lastName}", style = MaterialTheme.typography.bodyMedium)
                            }
                        }
                    }
                }
            }
        }
    }
}