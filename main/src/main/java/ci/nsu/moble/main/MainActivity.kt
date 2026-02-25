package ci.nsu.moble.main

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// Определение цветов
private val Red = Color(0xFFFF0000)
private val Orange = Color(0xFFFFA500)
private val Yellow = Color(0xFFFFFF00)
private val Green = Color(0xFF00FF00)
private val Blue = Color(0xFF0000FF)
private val Indigo = Color(0xFF4B0082)
private val Violet = Color(0xFFEE82EE)
private val DefaultButtonColor = Color(0xFFB39DDB) // Цвет кнопки по умолчанию

// Класс данных для элемента цвета
data class ColorItem(
    val index: Int,
    val name: String,
    val color: Color
)

// Карта цветов для поиска (регистронезависимый поиск)
private val colorsMap = mapOf(
    "Red" to Red,
    "Orange" to Orange,
    "Yellow" to Yellow,
    "Green" to Green,
    "Blue" to Blue,
    "Indigo" to Indigo,
    "Violet" to Violet,
)

// Создаем список цветов для палитры
private val colorsList = colorsMap.map { (name, color) ->
    ColorItem(colorsMap.keys.indexOf(name), name, color)
}

private const val TAG = "ColorSearch" // Тег для LogCat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme {
                Main()
            }
        }
    }
}

@Composable
fun Main(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        contentWindowInsets = WindowInsets.systemBars
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(all = 16.dp)
        ) {
            // Состояния
            var searchText by remember { mutableStateOf("") }
            var buttonColor by remember { mutableStateOf(DefaultButtonColor) }

            // Текст для отображения результата поиска
            var searchResultText by remember { mutableStateOf("") }

            // Поле ввода текста
            TextField(
                value = searchText,
                onValueChange = { searchText = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text("Введите название цвета") },
                singleLine = true
            )

            // Кнопка поиска цвета
            Button(
                onClick = {
                    // Поиск цвета в структуре данных
                    val foundColor = colorsMap.entries.find {
                        it.key.equals(searchText, ignoreCase = true)
                    }

                    if (foundColor != null) {
                        // Цвет найден - применяем к фону кнопки
                        buttonColor = foundColor.value
                        searchResultText = "Цвет '${foundColor.key}' найден и применен"
                        Log.d(TAG, "Цвет '${foundColor.key}' найден")
                    } else {
                        // Цвет не найден - кнопка остается неизменной
                        buttonColor = DefaultButtonColor
                        searchResultText = "Цвет '$searchText' не найден"
                        Log.d(TAG, "Пользовательский цвет '$searchText' не найден")
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = buttonColor
                )
            ) {
                Text(
                    text = "Найти цвет",
                    color = if (buttonColor == DefaultButtonColor) Color.White else Color.Black
                )
            }

            // Отображение результата поиска
            if (searchResultText.isNotEmpty()) {
                Text(
                    text = searchResultText,
                    modifier = Modifier.padding(top = 8.dp),
                    color = if (searchResultText.contains("не найден")) Color.Red else Color.Green
                )
            }

            // Заголовок для палитры
            Text(
                text = "Палитра доступных цветов:",
                modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
                style = MaterialTheme.typography.titleMedium
            )

            // Список цветов (палитра)
            LazyColumn {
                items(colorsList) { colorItem ->
                    Button(
                        onClick = {
                            // При клике на цвет в палитре:
                            // 1. Устанавливаем цвет кнопки
                            buttonColor = colorItem.color
                            // 2. Устанавливаем текст поиска
                            searchText = colorItem.name
                            // 3. Показываем результат
                            searchResultText = "Выбран цвет '${colorItem.name}'"
                            Log.d(TAG, "Выбран цвет из палитры: '${colorItem.name}'")
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 4.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = colorItem.color
                        )
                    ) {
                        Text(
                            text = colorItem.name,
                            color = Color.Black
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainPreview() {
    MaterialTheme {
        Main()
    }
}