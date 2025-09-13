package com.pgzxc.hiltdemo

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.pgzxc.hiltdemo.service.AnalyticsService
import com.pgzxc.hiltdemo.ui.MainScreen
import dagger.hilt.android.AndroidEntryPoint
import jakarta.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var analytics: AnalyticsService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        analytics.logEvent("MainActivity Started")
        setContent {
            MaterialTheme {
                MainScreen()
            }
        }
    }
}



@Composable
fun Greeting(name: String) {
    Text(text = name)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Greeting("Preview Text")
}