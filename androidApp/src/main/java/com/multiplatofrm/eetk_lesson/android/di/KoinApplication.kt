package com.multiplatofrm.eetk_lesson.android.di

import android.app.Application
import com.multiplatofrm.eetk_lesson.di.listModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class KoinApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@KoinApplication)
            androidLogger()
            modules(listModule())
        }
    }
}