package com.pgzxc.dagger2demo.component

import com.pgzxc.dagger2demo.MainActivity
import com.pgzxc.dagger2demo.di.AnalyticsModule
import com.pgzxc.dagger2demo.di.NetworkModule
import dagger.Component
import jakarta.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class, NetworkModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
}
