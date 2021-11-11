package com.example.dagger_hilt.V7_Component_Lifecycle

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dagger_hilt.R
import com.example.dagger_hilt.V6_Singleton.model.Mobile
import com.example.dagger_hilt.V7_Component_Lifecycle.model.Battery
import com.example.dagger_hilt.V7_Component_Lifecycle.model.Camera
import com.example.dagger_hilt.V7_Component_Lifecycle.model.Processor
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class V7Fragment : Fragment() {

    @Inject
    lateinit var processor1 : Processor

    @Inject
    lateinit var processor2 : Processor

    @Inject
    lateinit var battery1 : Battery

    @Inject
    lateinit var battery2 : Battery

    @Inject
    lateinit var camera1: Camera

    @Inject
    lateinit var camera2: Camera


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var myView : View = inflater.inflate(R.layout.fragment_v7, container, false)

        Log.e("V7Activity", "===============My Fragment=================")

        Log.e("V7Activity", "Processor 1 : $processor1")
        Log.e("V7Activity", "Processor 2 : $processor2")

        Log.e("V7Activity", "Battery 1 : $battery1")
        Log.e("V7Activity", "Battery 2 : $battery2")

        Log.e("V7Activity", "Camera 1 : $camera1")
        Log.e("V7Activity", "Camera 2 : $camera2")

        return myView
    }
}