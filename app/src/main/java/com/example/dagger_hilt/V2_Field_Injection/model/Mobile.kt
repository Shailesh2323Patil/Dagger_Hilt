package com.example.dagger_hilt.V2_Field_Injection.model

import javax.inject.Inject

/*
* @Inject constructor : To provide Mobile as Injection then we will use ( @Inject constructor )
* or else we use @Module.
*
*            Processor            Battery
*               |                    |
*                -------Mobile-------
* */
class Mobile @Inject constructor(var battery: Battery,var processor: Processor) {
}