package com.example.dagger_hilt.V4_Binds.module

import com.example.dagger_hilt.V4_Binds.model.Processor
import com.example.dagger_hilt.V4_Binds.model.Snapdragon
import dagger.Binds

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


/*
* @Binds is useful for interface implementation
* It is same as @Provides but here we no need extra code like below @Provides annotation
* * */

@Module
@InstallIn(SingletonComponent::class)
abstract class SnapdragonModule {

//    @Provides
//    fun getProcessor(snapdragon: Snapdragon) : Processor {
//        return snapdragon
//    }

    @Binds
    abstract fun getProcessor(snapdragon: Snapdragon) : Processor
}