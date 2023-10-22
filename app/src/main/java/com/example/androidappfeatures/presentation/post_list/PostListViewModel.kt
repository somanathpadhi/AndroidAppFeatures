package com.example.androidappfeatures.presentation.post_list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidappfeatures.common.Resource
import com.example.androidappfeatures.domain.usecase.GetPostsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PostListViewModel @Inject constructor(private val getPostsUseCase: GetPostsUseCase) :
    ViewModel() {
    private val _postList: MutableStateFlow<PostListState> = MutableStateFlow(PostListState())
    var postList: StateFlow<PostListState> = _postList
    fun getPosts() =
        viewModelScope.launch(Dispatchers.IO) {
            getPostsUseCase().collect {
                when (it) {
                    is Resource.Loading -> {
                        _postList.value = PostListState(isLoading = true)
                    }

                    is Resource.Error -> {
                        _postList.value = PostListState(error = it.message ?: "")
                    }

                    is Resource.Success -> {
                        _postList.value = PostListState(data = it.data)
                    }
                }
            }
        }


}