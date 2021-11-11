package com.example.dagger_hilt.V9_Dagger_Hilt_Room.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dagger_hilt.V9_Dagger_Hilt_Room.model.Post
import com.example.dagger_hilt.V9_Dagger_Hilt_Room.repo.PostRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ViewModel @Inject constructor(var repository: PostRepository) : ViewModel() {
    fun loadAll() : LiveData<List<Post>> = repository.loadAll()

    fun insertAll(vararg post: Post) = viewModelScope.launch { repository.insertAll(*post) }
}