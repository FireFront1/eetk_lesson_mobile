package com.multiplatofrm.eetk_lesson.core.dispatcher

import kotlinx.coroutines.CoroutineDispatcher

expect class MainDispatcher() {
    val dispatcher: CoroutineDispatcher
}