package com.example.dagger_hilt.V8_Dagger_Hilt_Retrofit.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dagger_hilt.V8_Dagger_Hilt_Retrofit.model.Post
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class V8ViewModel @Inject constructor(var repository: Repository) : ViewModel() {

    private var _post : MutableLiveData<List<Post>> = MutableLiveData()
    private var post : LiveData<List<Post>> = _post

    fun getPostLiveData() : LiveData<List<Post>> {
        return post
    }

    fun getFetchPostData() {
        viewModelScope.launch {
            var posts = repository.getPosts()
            _post.value = posts
        }
    }

}