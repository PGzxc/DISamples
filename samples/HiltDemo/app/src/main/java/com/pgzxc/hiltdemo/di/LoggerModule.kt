package com.pgzxc.hiltdemo.di

import com.pgzxc.hiltdemo.service.FileLogger
import com.pgzxc.hiltdemo.service.Logger
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

// di/LoggerModule.kt
@Module
@InstallIn(SingletonComponent::class)
object LoggerModule {
    @Provides
    fun provideLogger(): Logger = FileLogger()
}
