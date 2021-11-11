package com.example.dagger_hilt.V3_Module.model

import android.util.Log
import javax.inject.Inject

class Processor @Inject constructor() {
    init {
        Log.e("V3_Activity", "Processor : $this")
    }
}