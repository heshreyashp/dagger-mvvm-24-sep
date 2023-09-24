package com.cheezycode.daggermvvm

import android.app.Application
import com.cheezycode.daggermvvm.di.ApplicationComponent
import com.cheezycode.daggermvvm.di.DaggerApplicationComponent
import dagger.Component

class FakerApplication : Application() {

    lateinit var application: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        application = DaggerApplicationComponent.builder().build()

    }
}