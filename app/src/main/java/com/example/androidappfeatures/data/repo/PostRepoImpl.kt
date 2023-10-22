package com.example.androidappfeatures.data.repo

import com.example.androidappfeatures.common.CoroutineContextProvider
import com.example.androidappfeatures.data.model.PostDTO
import com.example.androidappfeatures.domain.repo.PostRepo
import com.example.androidappfeatures.data.data_store.remote.APIService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class PostRepoImpl @Inject constructor(
    private val apiService: APIService
) : PostRepo {
    override suspend fun getPosts(): List<PostDTO> = apiService.getPosts()
}