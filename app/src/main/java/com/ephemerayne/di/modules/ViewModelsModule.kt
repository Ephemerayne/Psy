package com.ephemerayne.di.modules

import androidx.lifecycle.ViewModel
import com.ephemerayne.MainViewModel
import com.ephemerayne.reminder.dagger.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelsModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun mainViewModel(viewModel: MainViewModel): ViewModel


}