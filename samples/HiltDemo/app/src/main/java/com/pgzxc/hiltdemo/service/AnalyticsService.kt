package com.pgzxc.hiltdemo.service

import android.util.Log
import jakarta.inject.Inject

// service/AnalyticsService.kt
class AnalyticsService @Inject constructor() {
    fun logEvent(event: String) {
        Log.d("AnalyticsService", "Event: $event")
    }
}
