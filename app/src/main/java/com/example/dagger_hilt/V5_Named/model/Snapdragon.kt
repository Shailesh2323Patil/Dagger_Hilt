package com.example.dagger_hilt.V5_Named.model

import android.util.Log
import javax.inject.Inject
import javax.inject.Named


/*
* Here we add two Properties as Core and ClockSpeed
* */
class Snapdragon @Inject constructor(@Named("Core") var core : Int,@Named("ClockSpeed") var clockSpeed : Int) : Processor {

    init {
        Log.e("V5_Activity", "Snapdragon : $this Core : $core ClockSpeed : $clockSpeed")

        start()
    }

    override fun start() {
        Log.e("V5_Activity", "start: Snapdragon")
    }
}