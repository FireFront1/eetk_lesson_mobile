package com.multiplatofrm.eetk_lesson.di.provide

import com.multiplatofrm.eetk_lesson.core.dispatcher.MainLoopDispatcher
import kotlinx.coroutines.CoroutineDispatcher

fun dispatcherProvide(): CoroutineDispatcher = MainLoopDispatcher