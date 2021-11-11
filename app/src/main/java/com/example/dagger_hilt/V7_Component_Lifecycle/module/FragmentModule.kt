package com.example.dagger_hilt.V7_Component_Lifecycle.module

import com.example.dagger_hilt.V7_Component_Lifecycle.model.Camera
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.FragmentScoped


/*
* To provide the scope to Fragment Wise then we use FragmentComponent
* and Fragment Related class we use @Singleton annotation
* */
@Module
@InstallIn(FragmentComponent::class)
class FragmentModule {

    /*
    * To Define Scope we use FragmentScoped for FragmentComponent
    * */
    @FragmentScoped
    @Provides
    fun getCamera() : Camera {
        return Camera()
    }

}