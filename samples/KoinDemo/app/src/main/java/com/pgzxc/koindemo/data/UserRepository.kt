package com.pgzxc.koindemo.data

data class User(val id: Int, val name: String)

class UserRepository {
    private val users = listOf(
        User(1, "Alice"),
        User(2, "Bob"),
        User(3, "Charlie")
    )

    fun getUserById(id: Int) = users.firstOrNull { it.id == id }
}