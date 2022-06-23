package com.multiplatofrm.eetk_lesson.android.ui.view.state

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.multiplatofrm.eetk_lesson.core.BasicUiState

@Composable
fun <T> ManagementResourceState(
    resourceState: BasicUiState<T>,
    successView: @Composable (data: T?) -> Unit,
    errorView: @Composable (message: String?) -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.fillMaxSize()
    ) {
        when (resourceState) {
            is BasicUiState.Error -> errorView(resourceState.message)
            BasicUiState.Loading -> Loading()
            is BasicUiState.Success -> successView(resourceState.data)
        }
    }
}