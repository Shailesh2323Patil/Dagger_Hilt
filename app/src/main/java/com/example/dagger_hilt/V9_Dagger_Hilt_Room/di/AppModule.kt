package com.example.dagger_hilt.V9_Dagger_Hilt_Room.di

import android.content.Context
import androidx.room.Room
import com.example.dagger_hilt.V9_Dagger_Hilt_Room.room.MyRoomDB
import com.example.dagger_hilt.V9_Dagger_Hilt_Room.room.PostDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    @Named("dbName")
    fun getDbName() : String = "RoomDb"

    @Singleton
    @Provides
    fun getRoomDb(@ApplicationContext context : Context,@Named("dbName") dbName : String) : MyRoomDB =
        Room.databaseBuilder(context,MyRoomDB::class.java,dbName).build()

    @Singleton
    @Provides
    fun getPostDao(db: MyRoomDB) : PostDao = db.getPostDao()

}