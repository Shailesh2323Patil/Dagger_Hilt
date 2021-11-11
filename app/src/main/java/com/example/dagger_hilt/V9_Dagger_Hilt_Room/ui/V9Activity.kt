package com.example.dagger_hilt.V9_Dagger_Hilt_Room.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels

import com.example.dagger_hilt.R
import com.example.dagger_hilt.V9_Dagger_Hilt_Room.model.Post
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class V9Activity : AppCompatActivity() {

    private val mViewModel : ViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_v9)

        mViewModel.insertAll(
            Post(0,"Shailesh","DEV 1"),
            Post(0,"Shailesh","DEV 2"),
            Post(0,"Shailesh","DEV 3"),
            Post(0,"Shailesh","DEV 4"),
            Post(0,"Shailesh","DEV 5"),
            Post(0,"Shailesh","DEV 6"),
            Post(0,"Shailesh","DEV 7"),
            Post(0,"Shailesh","DEV 8"),
        )

        mViewModel.loadAll().observe(this) {
            Log.e("V9Activity", "Data Size "+it.size)
        }
    }
}