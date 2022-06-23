package com.multiplatofrm.eetk_lesson.common

sealed class Resources<T>(val data: T?=null, val message: String?=null) {
    class Success<T>(data: T?): Resources<T>(data = data)
    class Error<T>(message: String?=null): Resources<T>(message = message)
}