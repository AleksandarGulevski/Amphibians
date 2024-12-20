package com.denofdevelopers.amphibians

import android.app.Application
import com.denofdevelopers.amphibians.data.AppContainer
import com.denofdevelopers.amphibians.data.DefaultAppContainer

class AmphibiansApplication : Application() {

    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}