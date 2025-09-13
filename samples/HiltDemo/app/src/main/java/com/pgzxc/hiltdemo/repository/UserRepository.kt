package com.pgzxc.hiltdemo.repository
import javax.inject.Inject

// 模拟一个数据源
class UserRepository @Inject constructor() {
    fun getUserName(): String = "Hello from Hilt!"
}