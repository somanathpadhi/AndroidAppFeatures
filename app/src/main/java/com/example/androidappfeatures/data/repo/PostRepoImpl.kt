package com.example.androidappfeatures.data.repo

import com.example.androidappfeatures.data.model.PostDTO
import com.example.androidappfeatures.domain.repo.PostRepo
import com.example.androidappfeatures.data.data_store.remote.APIService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class PostRepoImpl @Inject constructor(private val apiService: APIService) : PostRepo {
    override fun getPosts(): Flow<List<PostDTO>> = flow {
        emit(apiService.getPosts())
    }

}