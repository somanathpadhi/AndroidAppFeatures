package com.example.androidappfeatures.presentation.post_list

import androidx.lifecycle.ViewModel
import com.example.androidappfeatures.domain.usecase.GetPostsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PostListViewModel @Inject constructor(private val getPostsUseCase: GetPostsUseCase) :
    ViewModel() {
}