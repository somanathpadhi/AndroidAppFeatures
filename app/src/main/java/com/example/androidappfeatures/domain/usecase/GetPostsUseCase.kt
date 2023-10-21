package com.example.androidappfeatures.domain.usecase

import com.example.androidappfeatures.domain.repo.PostRepo
import javax.inject.Inject

class GetPostsUseCase @Inject constructor(private val postRepo: PostRepo) {
    operator fun invoke() = postRepo.getPosts()
}