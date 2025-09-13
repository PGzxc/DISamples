package com.pgzxc.dagger2demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.pgzxc.dagger2demo.service.AnalyticsService
import com.pgzxc.dagger2demo.service.ApiService
import com.pgzxc.dagger2demo.ui.AppScreen
import jakarta.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var analytics: AnalyticsService
    @Inject lateinit var apiService: ApiService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (application as MyApp).appComponent.inject(this)     // 注入

        setContent {
            AppScreen(analytics, apiService)
        }
    }
}
