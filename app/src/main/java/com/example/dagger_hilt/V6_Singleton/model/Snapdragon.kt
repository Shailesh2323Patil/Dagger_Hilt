package com.example.dagger_hilt.V6_Singleton.model

import android.util.Log
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton


/*
* Makes this class as Singleton using @Singleton on Constructor
* */
@Singleton
class Snapdragon @Inject constructor(@Named("Core_V6") var core : Int,@Named("ClockSpeed_V6") var clockSpeed : Int) : Processor {

    override fun start() {
        Log.e("V6_Activity", "start: Snapdragon")
    }
}