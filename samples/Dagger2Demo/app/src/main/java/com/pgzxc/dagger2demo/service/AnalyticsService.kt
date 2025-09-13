package com.pgzxc.dagger2demo.service

// 定义接口
interface AnalyticsService {
    fun trackEvent(event: String): String
}