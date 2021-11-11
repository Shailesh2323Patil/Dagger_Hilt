package com.example.dagger_hilt.V5_Named.module

import com.example.dagger_hilt.V5_Named.model.Processor
import com.example.dagger_hilt.V5_Named.model.Snapdragon
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named


/*
* @Named is useful to provide values to constructor as well as recognise the
* Values types
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
    @Named("Core")
    fun getCore() : Int = 8

    @Provides
    @Named("ClockSpeed")
    fun getClockSpeed() : Int = 9

}