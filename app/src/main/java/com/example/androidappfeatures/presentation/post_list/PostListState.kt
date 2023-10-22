package com.example.androidappfeatures.presentation.post_list

import com.example.androidappfeatures.domain.model.Post

data class PostListState(
    val isLoading: Boolean = false,
    val data: List<Post>? = null,
    val error: String = ""
)