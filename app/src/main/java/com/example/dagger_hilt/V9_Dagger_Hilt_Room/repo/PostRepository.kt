package com.example.dagger_hilt.V9_Dagger_Hilt_Room.repo

import com.example.dagger_hilt.V9_Dagger_Hilt_Room.model.Post
import com.example.dagger_hilt.V9_Dagger_Hilt_Room.room.PostDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject


class PostRepository @Inject constructor(val postDao: PostDao) {

    suspend fun insertAll(vararg post : Post) = withContext(Dispatchers.IO) {
        postDao.insertAll(*post)
    }

    fun loadAll() = postDao.loadAll()
}