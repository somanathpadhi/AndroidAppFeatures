package com.example.androidappfeatures.data.data_store.remote

import com.example.androidappfeatures.data.model.PostDTO
import retrofit2.http.GET

interface APIService {
    @GET("post")
    fun getPosts() : List<PostDTO>
}