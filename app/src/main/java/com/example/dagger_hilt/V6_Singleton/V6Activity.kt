package com.example.dagger_hilt.V6_Singleton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger_hilt.R
import com.example.dagger_hilt.V6_Singleton.model.Mobile
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


/*
* Module in dagger hilt || Provides methods in dagger hilt
*
* Here we Use Module Classes of Battery,Lithium and Cobalt for to the provide
* dependency in Mobile Classes, we suppose that the Battery, Lithium and Cobalt treated as
* Third Party Classes and we can't provide the Constructor Injection on the same classes.
* Hence we provide the Module in this Code.
*
* Note : First Need to set V3MyApplication class in AndroidManifest.xml File
* and uncomment the V3MyApplication if we open the class then it will gives TargetInvocationException
* */

/*
* @Singleton in Dagger Hilt || Scope in Dagger hilt
*
* The Information is on MobileModule, SnapdragonModule and Snapdragon class
*
* Note : First Need to set V6MyApplication class in AndroidManifest.xml File
* and uncomment the V6MyApplication if we open the class then it will gives TargetInvocationException
* */

@AndroidEntryPoint
class V6Activity : AppCompatActivity() {

    @Inject
    lateinit var mobile1 : Mobile

    @Inject
    lateinit var mobile2 : Mobile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_v3)
    }
}