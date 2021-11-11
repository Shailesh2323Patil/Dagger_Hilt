package com.example.dagger_hilt.V8_Dagger_Hilt_Retrofit.ui

import androidx.lifecycle.LiveData
import com.example.dagger_hilt.V8_Dagger_Hilt_Retrofit.model.Post
import com.example.dagger_hilt.V8_Dagger_Hilt_Retrofit.utils.PostRequest
import javax.inject.Inject

class Repository @Inject constructor (var postRequest: PostRequest) {
    suspend fun getPosts() : List<Post> {
        return postRequest.getPosts()
    }
}