package com.example.dagger_hilt.V9_Dagger_Hilt_Room.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.dagger_hilt.V9_Dagger_Hilt_Room.model.Post

@Dao
interface PostDao {

    @Insert
    suspend fun insert(post: Post)

    @Update
    suspend fun update(post: Post)

    @Delete
    suspend fun delete(post: Post)

    @Query("Select * From POST")
    fun loadAll() : LiveData<List<Post>>

    @Insert
    suspend fun insertAll(vararg post: Post)
}