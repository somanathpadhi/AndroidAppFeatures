package com.example.androidappfeatures.domain.repo

import com.example.androidappfeatures.data.model.PostDTO
import kotlinx.coroutines.flow.Flow

interface PostRepo {
    fun getPosts(): Flow<List<PostDTO>>
}