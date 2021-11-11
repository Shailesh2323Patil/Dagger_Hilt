package com.example.dagger_hilt.V3_Module.module

import com.example.dagger_hilt.V3_Module.model.Battery
import com.example.dagger_hilt.V3_Module.model.Cobalt
import com.example.dagger_hilt.V3_Module.model.Lithium
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