package com.example.dagger_hilt.V7_Component_Lifecycle.module


import com.example.dagger_hilt.V7_Component_Lifecycle.model.Processor
import com.example.dagger_hilt.V7_Component_Lifecycle.model.Snapdragon
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton


/*
* For Application Wise Scope we Use
* SingletonComponent and @Singleton annotation
* * */
@Module
@InstallIn(SingletonComponent::class)
class ApplicationModule {

    @Provides
    @Singleton
    fun getProcessor(snapdragon: Snapdragon) : Processor {
        return snapdragon
    }

    @Provides
    @Named("Core_V7")
    fun getCore() : Int = 8

    @Provides
    @Named("ClockSpeed_V7")
    fun getClockSpeed() : Int = 9

}