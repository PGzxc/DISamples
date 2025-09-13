package com.pgzxc.koindemo.viewmodel

import androidx.lifecycle.ViewModel
import com.pgzxc.koindemo.data.GreetingRepository


class HomeViewModel(private val greetingRepository: GreetingRepository) : ViewModel() {
    fun greet(name: String) = greetingRepository.getGreeting(name)
}
