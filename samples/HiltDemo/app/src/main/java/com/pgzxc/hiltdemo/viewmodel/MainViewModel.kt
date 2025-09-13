package com.pgzxc.hiltdemo.viewmodel

import androidx.lifecycle.ViewModel
import com.pgzxc.hiltdemo.repository.UserRepository
import com.pgzxc.hiltdemo.service.AnalyticsService
import com.pgzxc.hiltdemo.service.Logger
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

// ui/MainViewModel.kt
@HiltViewModel
class MainViewModel @Inject constructor(
        private val logger: Logger,
        private val analytics: AnalyticsService
) : ViewModel() {

    private val _message = MutableStateFlow("Hello Hilt + Compose!")
    val message: StateFlow<String> = _message

    fun doWork() {
        logger.log("ViewModel is working...")
        analytics.logEvent("Compose Screen Event")
        _message.value = "Hilt 已成功注入依赖 ✅"
    }
}

