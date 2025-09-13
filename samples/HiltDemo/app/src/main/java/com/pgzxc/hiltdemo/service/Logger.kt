package com.pgzxc.hiltdemo.service

import android.util.Log
import jakarta.inject.Inject

// service/Logger.kt
interface Logger {
    fun log(msg: String): Int
}

class FileLogger @Inject constructor() : Logger {
    override fun log(msg: String) = Log.d("FileLogger", msg)
}