package com.example.dagger_hilt.V6_Singleton.module

import com.example.dagger_hilt.V6_Singleton.model.Processor
import com.example.dagger_hilt.V6_Singleton.model.Snapdragon
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named


/*
* @Singleton we can use on above @Binds annotation also
*
* * */

@Module
@InstallIn(SingletonComponent::class)
class SnapdragonModule {

    @Provides
    fun getProcessor(snapdragon: Snapdragon) : Processor {
        return snapdragon
    }

    @Provides
    @Named("Core_V6")
    fun getCore() : Int = 8

    @Provides
    @Named("ClockSpeed_V6")
    fun getClockSpeed() : Int = 9

}