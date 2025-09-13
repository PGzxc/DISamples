package com.pgzxc.dagger2demo.service

// 模拟一个网络服务
class ApiService(private val baseUrl: String) {
    fun fetchData(): String = "Data from $baseUrl"
}