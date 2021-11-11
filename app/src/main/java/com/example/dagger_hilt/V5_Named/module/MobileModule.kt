package com.example.dagger_hilt.V5_Named.module

import com.example.dagger_hilt.V5_Named.model.Battery
import com.example.dagger_hilt.V5_Named.model.Cobalt
import com.example.dagger_hilt.V5_Named.model.Lithium
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

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

    @Provides
    fun getBattery(lithium : Lithium,cobalt: Cobalt) : Battery {
        return Battery(lithium,cobalt);
    }
 }