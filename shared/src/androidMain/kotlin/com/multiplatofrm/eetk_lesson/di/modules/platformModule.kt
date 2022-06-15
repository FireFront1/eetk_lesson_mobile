package com.multiplatofrm.eetk_lesson.di.modules

import com.multiplatofrm.eetk_lesson.di.provide.clientProvide
import com.multiplatofrm.eetk_lesson.di.provide.dispatcherProvide
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val platformModule = module {
    singleOf(::clientProvide)
    singleOf(::dispatcherProvide)
}