package com.pgzxc.dagger2demo.di

import com.pgzxc.dagger2demo.service.ApiService
import dagger.Module
import dagger.Provides

@Module
object NetworkModule {
    @Provides
    fun provideApiService(): ApiService {
        return ApiService("https://api.example.com")
    }
}
