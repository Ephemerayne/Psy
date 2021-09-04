package com.ephemerayne.di

import com.ephemerayne.di.modules.AppModule
import com.ephemerayne.di.modules.ViewModelsModule
import com.ephemerayne.psy.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        ViewModelsModule::class,
    ]
)

interface AppComponent {
    fun inject(mainActivity: MainActivity)
}