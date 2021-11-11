package com.example.dagger_hilt.V7_Component_Lifecycle.module

import com.example.dagger_hilt.V7_Component_Lifecycle.model.Battery
import com.example.dagger_hilt.V7_Component_Lifecycle.model.Cobalt
import com.example.dagger_hilt.V7_Component_Lifecycle.model.Lithium
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped


/*
* To provide the scope to Activity Wise then we use ActivityComponent
* and Activity Related class we use @Singleton annotation
* */
@Module
@InstallIn(ActivityComponent::class)
class ActivityModule {

    @Provides
    fun getLithium() : Lithium {
        return Lithium()
    }

    @Provides
    fun getCobalt() : Cobalt {
        return Cobalt();
    }

    /*
    * To Define Scope we use ActivityScoped in ActivityComponent
    * */
    @ActivityScoped
    @Provides
    fun getBattery(lithium : Lithium,cobalt: Cobalt) : Battery {
        return Battery(lithium,cobalt);
    }
 }