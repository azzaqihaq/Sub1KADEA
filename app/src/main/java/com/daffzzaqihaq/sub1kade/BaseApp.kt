package com.daffzzaqihaq.sub1kade

import android.app.Application
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.interceptors.HttpLoggingInterceptor

class BaseApp : Application() {

    override fun onCreate() {
        super.onCreate()

        AndroidNetworking.initialize(this)
        AndroidNetworking.enableLogging(HttpLoggingInterceptor.Level.BODY)
    }
}