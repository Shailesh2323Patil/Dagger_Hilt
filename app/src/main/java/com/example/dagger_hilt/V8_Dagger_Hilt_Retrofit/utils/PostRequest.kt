package com.example.dagger_hilt.V8_Dagger_Hilt_Retrofit.utils

import com.example.dagger_hilt.V8_Dagger_Hilt_Retrofit.model.Post
import retrofit2.http.GET

interface PostRequest {

    @GET("posts")
    suspend fun getPosts() : List<Post>

}