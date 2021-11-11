package com.example.dagger_hilt.V4_Binds.model

import android.util.Log
import javax.inject.Inject


/*
*           Snapdragon
*              |                              Lithium                    Cobalt
*              |                                 |                          |
*          Processor ( Interface )                ---------Battery----------
*              |                                             |
*               --------------------Mobile-------------------
* */
class Mobile @Inject constructor(processor: Processor,battery: Battery) {
    init {
        Log.e("V4_Activity", "Mobile : $this")
    }
}