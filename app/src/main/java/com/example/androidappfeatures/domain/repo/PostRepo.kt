package com.example.androidappfeatures.domain.repo

import com.example.androidappfeatures.data.model.PostDTO
import kotlinx.coroutines.flow.Flow

interface PostRepo {
    suspend fun getPosts(): List<PostDTO>
}