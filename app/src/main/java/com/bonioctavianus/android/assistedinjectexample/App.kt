package com.bonioctavianus.android.assistedinjectexample

import android.app.Application

class App : Application() {

    lateinit var graph: ApplicationGraph

    override fun onCreate() {
        super.onCreate()
        graph = DaggerApplicationGraph.create()
    }
}