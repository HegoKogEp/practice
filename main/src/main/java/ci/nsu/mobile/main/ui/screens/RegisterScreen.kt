package ci.nsu.mobile.main.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import ci.nsu.mobile.main.data.dto.model.GroupDto
import ci.nsu.mobile.main.ui.theme.AppStyles
import ci.nsu.mobile.main.ui.theme.screenPadding
import ci.nsu.mobile.main.viewmodels.RegisterViewModel
import ci.nsu.mobile.main.di.ServiceLocator

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(
    onNavigateBack: () -> Unit,
    viewModel: RegisterViewModel = viewModel(factory = ServiceLocator.getInstance().viewModelFactory)
) {
    val state by viewModel.state.collectAsState()

    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var middleName by remember { mutableStateOf("") }
    var birthDate by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("MALE") }
    var login by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }

    var selectedGroup by remember { mutableStateOf<GroupDto?>(null) }
    var groupExpanded by remember { mutableStateOf(false) }

    LaunchedEffect(state.isSuccess) {
        if (state.isSuccess) onNavigateBack()
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .screenPadding()
    ) {
        Text("Регистрация", style = MaterialTheme.typography.headlineSmall)
        Spacer(modifier = Modifier.height(24.dp))

        // Имя
        TextField(
            value = firstName,
            onValueChange = { firstName = it },
            label = { Text("Имя") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))

        // Фамилия
        TextField(
            value = lastName,
            onValueChange = { lastName = it },
            label = { Text("Фамилия") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))

        // Отчество
        TextField(
            value = middleName,
            onValueChange = { middleName = it },
            label = { Text("Отчество (опционально)") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))

        // Дата рождения
        TextField(
            value = birthDate,
            onValueChange = { birthDate = it },
            label = { Text("Дата рождения (ГГГГ-ММ-ДД)") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))

        // Пол
        Text("Пол", style = MaterialTheme.typography.labelLarge)
        Spacer(modifier = Modifier.height(4.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            FilterChip(
                selected = gender == "MALE",
                onClick = { gender = "MALE" },
                label = { Text("Мужской") },
                modifier = Modifier.weight(1f)
            )

            FilterChip(
                selected = gender == "FEMALE",
                onClick = { gender = "FEMALE" },
                label = { Text("Женский") },
                modifier = Modifier.weight(1f)
            )
        }
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))

        // Группа
        ExposedDropdownMenuBox(
            expanded = groupExpanded,
            onExpandedChange = { groupExpanded = it }
        ) {
            TextField(
                value = selectedGroup?.name ?: "Выберите группу",
                onValueChange = {},
                readOnly = true,
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = groupExpanded) },
                modifier = Modifier
                    .menuAnchor()
                    .fillMaxWidth()
            )

            ExposedDropdownMenu(
                expanded = groupExpanded,
                onDismissRequest = { groupExpanded = false }
            ) {
                state.groups.forEach { group ->
                    DropdownMenuItem(
                        text = { Text(group.name) },
                        onClick = {
                            selectedGroup = group
                            groupExpanded = false
                        }
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))

        // Логин
        TextField(
            value = login,
            onValueChange = { login = it },
            label = { Text("Логин") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))

        // Пароль
        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Пароль") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))

        // Email
        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))

        // Телефон
        TextField(
            value = phone,
            onValueChange = { phone = it },
            label = { Text("Телефон") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))

        // Ошибка
        if (state.error != null) {
            Text(
                text = state.error!!,
                color = MaterialTheme.colorScheme.error,
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(bottom = 8.dp)
            )
        }

        // Кнопка регистрации
        Button(
            onClick = {
                selectedGroup?.let { group ->
                    viewModel.registerUser(
                        firstName = firstName,
                        lastName = lastName,
                        middleName = middleName.ifEmpty { "" },
                        birthDate = birthDate,
                        gender = gender,
                        groupId = group.id,
                        login = login,
                        password = password,
                        email = email,
                        phoneNumber = phone
                    )
                }
            },
            enabled = !state.isLoading
                    && selectedGroup != null
                    && login.isNotEmpty()
                    && password.isNotEmpty(),
            modifier = Modifier.fillMaxWidth(),
            shape = AppStyles.ShapeMedium
        ) {
            if (state.isLoading) {
                CircularProgressIndicator(
                    modifier = Modifier.size(20.dp),
                    color = MaterialTheme.colorScheme.onPrimary
                )
            } else {
                Text("Зарегистрироваться")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Кнопка назад
        TextButton(
            onClick = onNavigateBack,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text("Назад к входу")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview(showBackground = true)
fun RegisterScreenPreview() {

    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var middleName by remember { mutableStateOf("") }
    var birthDate by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("MALE") }
    var login by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }

    var selectedGroup by remember { mutableStateOf<GroupDto?>(null) }
    var groupExpanded by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .screenPadding()
    ) {
        Text("Регистрация", style = MaterialTheme.typography.headlineSmall)
        Spacer(modifier = Modifier.height(24.dp))

        // Имя
        TextField(
            value = firstName,
            onValueChange = { firstName = it },
            label = { Text("Имя") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))

        // Фамилия
        TextField(
            value = lastName,
            onValueChange = { lastName = it },
            label = { Text("Фамилия") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))

        // Отчество
        TextField(
            value = middleName,
            onValueChange = { middleName = it },
            label = { Text("Отчество (опционально)") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))

        // Дата рождения
        TextField(
            value = birthDate,
            onValueChange = { birthDate = it },
            label = { Text("Дата рождения (ГГГГ-ММ-ДД)") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))

        // Пол
        Text("Пол", style = MaterialTheme.typography.labelLarge)
        Spacer(modifier = Modifier.height(4.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            FilterChip(
                selected = gender == "MALE",
                onClick = { gender = "MALE" },
                label = { Text("Мужской") },
                modifier = Modifier.weight(1f)
            )

            FilterChip(
                selected = gender == "FEMALE",
                onClick = { gender = "FEMALE" },
                label = { Text("Женский") },
                modifier = Modifier.weight(1f)
            )
        }
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))

        // Группа
        ExposedDropdownMenuBox(
            expanded = groupExpanded,
            onExpandedChange = { groupExpanded = it }
        ) {
            TextField(
                value = selectedGroup?.name ?: "Выберите группу",
                onValueChange = {},
                readOnly = true,
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = groupExpanded) },
                modifier = Modifier
                    .menuAnchor()
                    .fillMaxWidth()
            )

            ExposedDropdownMenu(
                expanded = groupExpanded,
                onDismissRequest = { groupExpanded = false }
            ) {

            }
        }
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))

        // Логин
        TextField(
            value = login,
            onValueChange = { login = it },
            label = { Text("Логин") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))

        // Пароль
        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Пароль") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))

        // Email
        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))

        // Телефон
        TextField(
            value = phone,
            onValueChange = { phone = it },
            label = { Text("Телефон") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))


        // Кнопка регистрации
        Button(
            onClick = {  },
            modifier = Modifier.fillMaxWidth(),
            shape = AppStyles.ShapeMedium
        ) {
            Text("Зарегистрироваться")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Кнопка назад
        TextButton(
            onClick = {  },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text("Назад к входу")
        }
    }
}