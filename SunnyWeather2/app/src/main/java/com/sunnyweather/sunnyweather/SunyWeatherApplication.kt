package com.sunnyweather.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunyWeatherApplication : Application() {
    companion object {
        @SuppressLint("StatocFieldLeak")
        lateinit var context: Context

        const val TOKEN = "BNBRvBveaD2VfHVI"

    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}