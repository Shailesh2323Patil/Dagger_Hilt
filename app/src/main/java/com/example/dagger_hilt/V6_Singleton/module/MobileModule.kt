package com.example.dagger_hilt.V6_Singleton.module


import com.example.dagger_hilt.V6_Singleton.model.Battery
import com.example.dagger_hilt.V6_Singleton.model.Cobalt
import com.example.dagger_hilt.V6_Singleton.model.Lithium
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MobileModule {

    @Provides
    fun getLithium() : Lithium {
        return Lithium()
    }

    @Provides
    fun getCobalt() : Cobalt {
        return Cobalt();
    }

    /*
    * Make Battery Class as Singleton on @Provides
    * */
    @Singleton
    @Provides
    fun getBattery(lithium : Lithium,cobalt: Cobalt) : Battery {
        return Battery(lithium,cobalt);
    }
 }