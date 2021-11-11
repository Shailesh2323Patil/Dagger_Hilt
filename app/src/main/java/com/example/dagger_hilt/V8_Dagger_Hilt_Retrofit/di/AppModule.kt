package com.example.dagger_hilt.V8_Dagger_Hilt_Retrofit.di

import com.example.dagger_hilt.V8_Dagger_Hilt_Retrofit.utils.PostRequest
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun getBaseUrl() : String {
        return "https://jsonplaceholder.typicode.com/"
    }

    @Singleton
    @Provides
    fun getClient() : OkHttpClient {
        return OkHttpClient.Builder()
                .connectTimeout(60,TimeUnit.SECONDS)
                .readTimeout(60,TimeUnit.SECONDS)
                .build()
    }

    @Singleton
    @Provides
    fun getRetrofit(baseUrl : String,client: OkHttpClient) : Retrofit {
        return Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
    }

    @Singleton
    @Provides
    fun getPostRequest(retrofit: Retrofit) : PostRequest {
        return retrofit.create(PostRequest::class.java)
    }
}