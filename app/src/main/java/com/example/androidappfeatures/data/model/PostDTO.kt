package com.example.androidappfeatures.data.model

import com.example.androidappfeatures.domain.model.Post

data class PostDTO(
    val body: String,
    val id: Int,
    val title: String,
    val userId: Int
)