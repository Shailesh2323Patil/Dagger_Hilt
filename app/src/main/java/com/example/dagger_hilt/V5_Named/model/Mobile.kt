package com.example.dagger_hilt.V5_Named.model

import android.util.Log
import javax.inject.Inject


/*
*
*
*
*   Core                  ClockSpeed
*    |                        |
*    -------Snapdragon--------
*              |                              Lithium                    Cobalt
*              |                                 |                          |
*          Processor ( Interface )                ---------Battery----------
*              |                                             |
*               --------------------Mobile-------------------
* */
class Mobile @Inject constructor(processor: Processor,battery: Battery) {
    init {
        Log.e("V5_Activity", "Mobile : $this")
    }
}