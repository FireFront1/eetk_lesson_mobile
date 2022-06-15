package com.multiplatofrm.eetk_lesson.presentation.executor

import kotlinx.coroutines.CompletableJob
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import kotlin.coroutines.CoroutineContext

abstract class MainIoExecutor : IExecutorScope, CoroutineScope, KoinComponent {

    private val mainDispatcher: CoroutineDispatcher by inject()
    private val ioDispatcher: CoroutineDispatcher by inject()

    private val  job: CompletableJob = SupervisorJob()

    override val coroutineContext: CoroutineContext
        get() = job + mainDispatcher

    override fun cancel() {
        job.cancel()
    }

    protected fun <T> launch(
        flow: Flow<T>,
        onSuccess: (T) -> Unit,
        onError: ((Throwable) -> Unit)? = null
    ) {
        launch {
            flow
                .flowOn(ioDispatcher)
                .catch {
                    onError?.invoke(it)
                }
                .collect {
                    onSuccess(it)
                }
        }
    }

    protected fun <T> collect(flow: Flow<T>, collect: (T) -> Unit) {
        launch {
            flow.collect { collect(it) }
        }
    }
}