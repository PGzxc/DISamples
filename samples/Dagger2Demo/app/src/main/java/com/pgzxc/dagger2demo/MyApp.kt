package com.pgzxc.dagger2demo

import android.app.Application
import com.pgzxc.dagger2demo.component.AppComponent
import com.pgzxc.dagger2demo.component.DaggerAppComponent

class MyApp : Application() {
    lateinit var appComponent: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}
