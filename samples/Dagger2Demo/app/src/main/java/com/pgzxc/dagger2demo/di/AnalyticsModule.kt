package com.pgzxc.dagger2demo.di

import com.pgzxc.dagger2demo.service.AnalyticsService
import com.pgzxc.dagger2demo.service.ApiService
import com.pgzxc.dagger2demo.service.FirebaseAnalyticsService
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface AnalyticsModule {
    @Binds
    fun bindAnalytics(impl: FirebaseAnalyticsService): AnalyticsService
}



