package com.example.androidappfeatures.di

import com.example.androidappfeatures.data.data_store.remote.APIService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
class HiltNetworkModule {
    @Provides
    fun getBaseURL() = "https://jsonplaceholder.typicode.com/"
    @Provides
    fun getRetrofit(url: String): Retrofit =
        Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    @Provides
    fun getAPIService(retrofit: Retrofit): APIService =
        retrofit.create(APIService::class.java)

}