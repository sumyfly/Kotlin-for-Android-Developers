package com.antonioleiva.weatherapp.ui

import android.app.Application
import android.support.multidex.MultiDexApplication
import com.antonioleiva.weatherapp.extensions.DelegatesExt

class App : MultiDexApplication() {

    companion object {
        var instance: App by DelegatesExt.notNullSingleValue()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}