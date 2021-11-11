package com.example.dagger_hilt.V2_Field_Injection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.dagger_hilt.R
import com.example.dagger_hilt.V2_Field_Injection.model.Mobile
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/*
* Constructor injection in dagger hilt | Field injection in dagger hilt
* Field Injection
*
* @Inject : Is useful for Field Inject.
*
* Note : First Need to set V2MyApplication class in AndroidManifest.xml File
* and uncomment the V2MyApplication if we open the class then it will gives TargetInvocationException
* */
@AndroidEntryPoint
class V2Activity : AppCompatActivity() {

    @Inject
    lateinit var mobile : Mobile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_v2)

        Log.e("V2Activity", "Mobile : $mobile");
    }
}