package com.multiplatofrm.scooterapp.base

sealed class BasicUiState<out T> {
    data class Success<T>(val data: T) : BasicUiState<T>()
    data class Error(val message: String? = null) : BasicUiState<Nothing>()
    object Loading : BasicUiState<Nothing>()
    object Idle : BasicUiState<Nothing>()
}
