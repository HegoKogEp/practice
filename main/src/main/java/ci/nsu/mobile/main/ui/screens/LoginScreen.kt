package ci.nsu.mobile.main.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import ci.nsu.mobile.main.ui.theme.AppStyles
import ci.nsu.mobile.main.ui.theme.screenPadding
import ci.nsu.mobile.main.viewmodels.LoginViewModel

@Composable
fun LoginScreen(
    onNavigateToRegister: () -> Unit,
    onLoginSuccess: () -> Unit,
    viewModel: LoginViewModel = viewModel()
) {
    val state by viewModel.state.collectAsState()
    var login by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    LaunchedEffect(
        state.isSuccess
    ) {
        if(state.isSuccess) {
            onLoginSuccess()
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .screenPadding(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Вход", style = MaterialTheme.typography.headlineMedium)

        Spacer(Modifier.height(32.dp))

        TextField(
            value = login,
            onValueChange = { login = it },
            label = { Text("Логин") },
            modifier = Modifier
                .fillMaxWidth(),
            singleLine = true
        )

        Spacer(Modifier.height(AppStyles.FieldSpacing))

        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Пароль") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )

        Spacer(Modifier.height(24.dp))

        Button(
            onClick = { viewModel.loginUser(login, password) },
            enabled = !state.isLoading
                    && login.isNotEmpty()
                    && password.isNotEmpty(),
            modifier = Modifier.fillMaxWidth(),
            shape = AppStyles.ShapeMedium
        ) {
            if(state.isLoading) {
                CircularProgressIndicator(
                    modifier = Modifier
                        .size(20.dp),
                    color = MaterialTheme.colorScheme.onPrimary
                )
            } else {
                Text("Войти")
            }

            if (state.error != null) {
                Spacer(Modifier.height(8.dp))
                Text(state.error!!, color = MaterialTheme.colorScheme.error, style = MaterialTheme.typography.bodySmall)
            }
        }

        Button(
            onClick = onNavigateToRegister,
            modifier = Modifier.fillMaxWidth(),
            shape = AppStyles.ShapeMedium
        ) {
            Text("Зарегистрироваться")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun LoginScreenPreview() {
    var login: String = ""
    var password: String = ""

    Column(
        modifier = Modifier
            .fillMaxSize()
            .screenPadding(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Вход", style = MaterialTheme.typography.headlineMedium)

        Spacer(Modifier.height(32.dp))

        TextField(
            value = login,
            onValueChange = { login = it },
            label = { Text("Логин") },
            modifier = Modifier
                .fillMaxWidth(),
            singleLine = true
        )

        Spacer(Modifier.height(AppStyles.FieldSpacing))

        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Пароль") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )

        Spacer(Modifier.height(24.dp))

        Button(
            onClick = {  },
            modifier = Modifier.fillMaxWidth(),
            shape = AppStyles.ShapeMedium
        ) {
            Text("Войти")
        }

        Button(
            onClick = {  },
            modifier = Modifier.fillMaxWidth(),
            shape = AppStyles.ShapeMedium
        ) {
            Text("Зарегистрироваться")
        }
    }
}