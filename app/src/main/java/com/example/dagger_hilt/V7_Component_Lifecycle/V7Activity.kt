package com.example.dagger_hilt.V7_Component_Lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.example.dagger_hilt.R
import com.example.dagger_hilt.V7_Component_Lifecycle.model.Battery
import com.example.dagger_hilt.V7_Component_Lifecycle.model.Processor
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


/*
* Component lifetimes in dagger hilt || Component scopes in Dagger Hilt
*
* Application - Processor
* Activity - Battery
* Fragment - Camera
*
* The Information Provide in ApplicationModule, ActivityModule, FragmentModule
*
* * Note : First Need to set V7Application class in AndroidManifest.xml File
* and uncomment the V7Application if we open the class then it will gives TargetInvocationException
* */

@AndroidEntryPoint
class V7Activity : AppCompatActivity() {

    @Inject
    lateinit var processor1 : Processor

    @Inject
    lateinit var processor2 : Processor

    @Inject
    lateinit var battery1 : Battery

    @Inject
    lateinit var battery2 : Battery


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_v7)

        replaceFragment(V7Fragment())

        Log.e("V7Activity", "===============My Activity=================")
        Log.e("V7Activity", "Processor 1 : $processor1")
        Log.e("V7Activity", "Processor 2 : $processor2")

        Log.e("V7Activity", "Battery 1 : $battery1")
        Log.e("V7Activity", "Battery 2 : $battery2")
    }

    fun replaceFragment(fragment: Fragment) {
        var beginTransaction = supportFragmentManager.beginTransaction()
        beginTransaction.add(R.id.root,fragment)
        beginTransaction.commit()
    }
}