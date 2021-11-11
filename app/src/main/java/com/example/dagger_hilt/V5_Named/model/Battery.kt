package com.example.dagger_hilt.V5_Named.model

import android.util.Log

class Battery(lithium: Lithium,cobalt: Cobalt) {
    // Suppose, We can't create the object of this class.
    init {
        Log.e("V5_Activity", "Battery : $this")
    }
}