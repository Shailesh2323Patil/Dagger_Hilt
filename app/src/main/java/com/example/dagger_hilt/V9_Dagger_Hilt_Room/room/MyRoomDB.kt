package com.example.dagger_hilt.V9_Dagger_Hilt_Room.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.dagger_hilt.V9_Dagger_Hilt_Room.model.Post

@Database(entities = [Post::class],version = 1,exportSchema = false)
abstract class MyRoomDB : RoomDatabase() {

    abstract fun getPostDao() : PostDao

}