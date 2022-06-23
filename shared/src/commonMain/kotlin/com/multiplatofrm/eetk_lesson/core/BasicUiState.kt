package com.multiplatofrm.eetk_lesson.core

sealed class BasicUiState<out T> {
    data class Success<T>(val data: T) : BasicUiState<T>()
    data class Error(val message: String? = null) : BasicUiState<Nothing>()
    object Loading : BasicUiState<Nothing>()
}
