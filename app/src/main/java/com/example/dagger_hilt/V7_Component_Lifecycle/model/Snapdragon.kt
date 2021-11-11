package com.example.dagger_hilt.V7_Component_Lifecycle.model

import android.util.Log
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton


/*
* Makes this class as Singleton using @Singleton on Constructor
* */
@Singleton
class Snapdragon @Inject constructor(@Named("Core_V7") var core : Int,@Named("ClockSpeed_V7") var clockSpeed : Int) : Processor {

    override fun start() {
        Log.e("V7_Activity", "start: Snapdragon")
    }
}