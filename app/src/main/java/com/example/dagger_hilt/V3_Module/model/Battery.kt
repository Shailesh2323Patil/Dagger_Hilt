package com.example.dagger_hilt.V3_Module.model

import android.util.Log

class Battery(lithium: Lithium,cobalt: Cobalt) {
    // Suppose, We can't create the object of this class.
    init {
        Log.e("V3_Activity", "Battery : $this")
    }
}