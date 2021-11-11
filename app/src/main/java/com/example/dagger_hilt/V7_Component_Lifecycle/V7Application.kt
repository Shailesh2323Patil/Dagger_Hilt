package com.example.dagger_hilt.V7_Component_Lifecycle

import android.app.Application
import android.util.Log
import com.example.dagger_hilt.V7_Component_Lifecycle.model.Processor
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

//@HiltAndroidApp
class V7Application : Application() {

    @Inject
    lateinit var processor1 : Processor

    @Inject
    lateinit var processor2 : Processor

    override fun onCreate() {
        super.onCreate()

        Log.e("V7Activity", "===============My Application=================")
        Log.e("V7Activity", "Processor 1 : $processor1")
        Log.e("V7Activity", "Processor 2 : $processor2")
    }
}