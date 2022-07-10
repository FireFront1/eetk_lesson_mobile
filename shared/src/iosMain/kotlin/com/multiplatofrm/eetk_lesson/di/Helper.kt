package com.multiplatofrm.eetk_lesson.di.modules

import com.multiplatofrm.eetk_lesson.di.listModule
import org.koin.core.context.startKoin

fun initKoinIos() {
    startKoin {
        modules(listModule())
    }
}