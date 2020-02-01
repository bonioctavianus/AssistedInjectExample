package com.bonioctavianus.android.assistedinjectexample

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AssistedInjectModule::class])
interface ApplicationGraph {
    val secondViewModelFactory: SecondViewModelFactory.Factory
}