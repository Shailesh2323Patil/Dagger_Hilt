package com.example.dagger_hilt.V7_Component_Lifecycle.model

import android.util.Log
import javax.inject.Inject


/*
*   Core                  ClockSpeed
*    |                        |
*    -------Snapdragon--------
*              |                                             Lithium                    Cobalt
*              |                             Camera             |                          |
*          Processor ( Interface )             |                 ---------Battery----------
*              |                               |                             |
*               -----------------------------Mobile---------------------------
* */
class Mobile @Inject constructor(processor: Processor,battery: Battery) {

}