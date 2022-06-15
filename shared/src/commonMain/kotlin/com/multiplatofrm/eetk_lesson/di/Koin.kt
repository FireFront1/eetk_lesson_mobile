package com.multiplatofrm.eetk_lesson.di

import com.multiplatofrm.eetk_lesson.di.modules.dataModule
import com.multiplatofrm.eetk_lesson.di.modules.domainModule
import com.multiplatofrm.eetk_lesson.di.modules.platformModule

fun listModule() = mutableListOf(dataModule, domainModule, platformModule)