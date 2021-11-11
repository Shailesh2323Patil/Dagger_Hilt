package com.example.dagger_hilt.V4_Binds.model

import android.util.Log
import javax.inject.Inject


class Snapdragon @Inject constructor() : Processor {

    init {
        Log.e("V4_Activity", "Snapdragon : $this")

        start()
    }

    override fun start() {
        Log.e("V4_Activity", "start: Snapdragon")
    }
}