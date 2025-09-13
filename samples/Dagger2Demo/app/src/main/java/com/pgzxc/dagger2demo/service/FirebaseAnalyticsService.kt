package com.pgzxc.dagger2demo.service

import jakarta.inject.Inject

// 实现类
class FirebaseAnalyticsService @Inject constructor() : AnalyticsService {
    override fun trackEvent(event: String): String {
        return "Firebase tracking: $event"
    }
}