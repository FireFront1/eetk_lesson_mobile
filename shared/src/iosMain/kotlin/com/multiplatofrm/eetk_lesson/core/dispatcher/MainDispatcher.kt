package com.multiplatofrm.eetk_lesson.core.dispatcher

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Runnable
import platform.Foundation.NSRunLoop
import platform.Foundation.performBlock
import kotlin.coroutines.CoroutineContext

actual class MainDispatcher {
    actual val dispatcher: CoroutineDispatcher = MainLoopDispatcher
}