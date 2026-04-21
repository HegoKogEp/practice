package ci.nsu.mobile.main.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import ci.nsu.mobile.main.di.ServiceLocator
import ci.nsu.mobile.main.ui.theme.AppStyles
import ci.nsu.mobile.main.ui.theme.screenPadding
import ci.nsu.mobile.main.viewmodels.LoginViewModel

@Composable
fun LoginScreen(
    onLoginSuccess: () -> Unit,
    onNavigateToRegister: () -> Unit,
    viewModel: LoginViewModel = viewModel(factory = ServiceLocator.getInstance().viewModelFactory)
) {
    val state by viewModel.state.collectAsState()
    var login by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    LaunchedEffect(state.isSuccess) {
        if (state.isSuccess) {
            viewModel.resetSuccess()
            onLoginSuccess()
        }
    }

    Column(
        modifier = Modifier.fillMaxSize().screenPadding(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Вход", style = MaterialTheme.typography.headlineMedium)
        Spacer(Modifier.height(32.dp))
        TextField(
            value = login, onValueChange = { login = it },
            label = { Text("Логин") }, modifier = Modifier.fillMaxWidth(), singleLine = true
        )
        Spacer(Modifier.height(AppStyles.FieldSpacing))
        TextField(
            value = password, onValueChange = { password = it },
            label = { Text("Пароль") }, visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(), singleLine = true
        )
        Spacer(Modifier.height(24.dp))
        Button(
            onClick = { viewModel.loginUser(login, password) },
            enabled = !state.isLoading && login.isNotEmpty() && password.isNotEmpty(),
            modifier = Modifier.fillMaxWidth()
        ) {
            if (state.isLoading) CircularProgressIndicator(modifier = Modifier.size(20.dp))
            else Text("Войти")
        }
        if (state.error != null) {
            Text(state.error!!, color = MaterialTheme.colorScheme.error, modifier = Modifier.padding(top = 8.dp))
        }
        Spacer(Modifier.height(8.dp))
        TextButton(onClick = onNavigateToRegister) { Text("Зарегистрироваться") }
    }
}