package com.example.androidappfeatures.domain.usecase

import com.example.androidappfeatures.common.CoroutineContextProvider
import com.example.androidappfeatures.common.Resource
import com.example.androidappfeatures.domain.model.Post
import com.example.androidappfeatures.domain.model.toDomain
import com.example.androidappfeatures.domain.repo.PostRepo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetPostsUseCase @Inject constructor(
    private val postRepo: PostRepo,
    private val coroutineContextProvider: CoroutineContextProvider
) {
    suspend operator fun invoke(): Flow<Resource<List<Post>>> =
        flow {
            try {
                val posts = postRepo.getPosts().map { it.toDomain() }
                emit(Resource.Success(posts))
            } catch (e: HttpException) {
                emit(Resource.Error(message = "${e.localizedMessage} unexpected Error"))
            } catch (e: IOException) {
                emit(Resource.Error(message = "Error Occurred"))
            } catch (e: Exception) {
                emit(Resource.Error(message = "Unknown Error"))
            }
        }.flowOn(coroutineContextProvider.io)
}