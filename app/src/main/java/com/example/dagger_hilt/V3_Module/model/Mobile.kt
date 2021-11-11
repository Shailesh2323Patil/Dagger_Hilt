package com.example.dagger_hilt.V3_Module.model

import android.util.Log
import javax.inject.Inject


/*
*
*                                        Lithium                    Cobalt
*                                           |                          |
*                 Processor                  ---------Battery----------
*                    |                                  |
*                     -------------Mobile---------------
* */
class Mobile @Inject constructor(processor: Processor,battery: Battery) {
    init {
        Log.e("V3_Activity", "Mobile : $this")
    }
}