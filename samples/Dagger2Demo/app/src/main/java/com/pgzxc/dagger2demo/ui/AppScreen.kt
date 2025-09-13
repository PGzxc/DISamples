package com.pgzxc.dagger2demo.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pgzxc.dagger2demo.service.AnalyticsService
import com.pgzxc.dagger2demo.service.ApiService


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppScreen(analytics: AnalyticsService, apiService: ApiService) {
    var message by remember { mutableStateOf("点击按钮触发事件") }

    Scaffold(topBar = { TopAppBar(title = { Text("Dagger2 + Compose Demo") }) }) { padding ->
        Column(modifier = Modifier.fillMaxSize().padding(padding).padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)) {
            Text(text = message)
            Button(onClick = { message = analytics.trackEvent("Button Clicked") }) {
                Text("触发 Analytics")
            }

            Button(onClick = { message = apiService.fetchData() }) {
                Text("请求 API 数据")
            }
        }
    }



}

