package com.allanh.androidtest

import android.app.Application
import android.content.Context
import com.allanh.androidtest.di.appModule
import com.allanh.androidtest.di.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
    }

    override fun onCreate() {
        super.onCreate()

        startKoin {
            // Android context
            androidContext(this@MyApplication)
            // modules
            modules(listOf(networkModule, appModule))
        }
    }
}