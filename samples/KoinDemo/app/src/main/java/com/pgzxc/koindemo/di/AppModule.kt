package com.pgzxc.koindemo.di


import com.pgzxc.koindemo.data.GreetingRepository
import com.pgzxc.koindemo.data.UserRepository
import com.pgzxc.koindemo.viewmodel.DetailViewModel
import com.pgzxc.koindemo.viewmodel.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single { GreetingRepository() }
    single { UserRepository() }

    viewModel { HomeViewModel(get()) }
    viewModel { DetailViewModel(get()) }
}
