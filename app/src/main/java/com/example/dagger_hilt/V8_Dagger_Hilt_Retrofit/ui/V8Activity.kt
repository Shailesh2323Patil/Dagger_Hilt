package com.example.dagger_hilt.V8_Dagger_Hilt_Retrofit.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.dagger_hilt.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/*
* Note : First Need to set V8Application class in AndroidManifest.xml File
* and uncomment the V8Application if we open the class then it will gives TargetInvocationException
* */
@AndroidEntryPoint
class V8Activity : AppCompatActivity() {

    private val viewModel: V8ViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_v8)

        viewModel.getPostLiveData().observe(this, Observer {
            Log.e("V8Activity", "List Size : "+it.size )
        })

        viewModel.getFetchPostData()
    }
}