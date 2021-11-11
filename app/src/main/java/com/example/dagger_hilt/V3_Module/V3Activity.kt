package com.example.dagger_hilt.V3_Module

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.dagger_hilt.R
import com.example.dagger_hilt.V3_Module.model.Mobile
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Singleton

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

@AndroidEntryPoint
class V3Activity : AppCompatActivity() {

    @Inject
    lateinit var mobile: Mobile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_v3)

        Log.e("V3_Activity", "onCreate: Mobile : $mobile")
    }
}