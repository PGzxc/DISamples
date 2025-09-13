package com.pgzxc.koindemo.viewmodel

import androidx.lifecycle.ViewModel
import com.pgzxc.koindemo.data.User
import com.pgzxc.koindemo.data.UserRepository

class DetailViewModel(private val userRepository: UserRepository) : ViewModel() {
    fun getUser(id: Int): User? = userRepository.getUserById(id)
}