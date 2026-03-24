package ci.nsu.moble.views

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import ci.nsu.moble.viewmodels.CounterViewModel
import ci.nsu.moble.data.CounterUiState
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun MyScreen(
    viewModel: CounterViewModel = viewModel(), modifier : Modifier = Modifier
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    Column(modifier = Modifier) {

    }
}

@Composable
@Preview
fun MyScreenPreview(){
    Text(text = "Счетчик")
}
