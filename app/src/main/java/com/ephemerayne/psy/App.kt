package com.ephemerayne.psy

import android.app.Application
import com.ephemerayne.di.AppComponent
import com.ephemerayne.di.DaggerAppComponent
import com.ephemerayne.di.modules.AppModule

class App : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = initAppComponent()
    }

    private fun initAppComponent(): AppComponent = DaggerAppComponent.builder()
        .appModule(AppModule(this))
        .build()
}