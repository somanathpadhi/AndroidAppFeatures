package com.example.androidappfeatures.di

import com.example.androidappfeatures.common.CoroutineContextProvider
import com.example.androidappfeatures.data.data_store.remote.APIService
import com.example.androidappfeatures.data.repo.PostRepoImpl
import com.example.androidappfeatures.domain.repo.PostRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class HiltNetworkModule {
    @Provides
    @Singleton
    fun getBaseURL() = "https://jsonplaceholder.typicode.com/"

    @Provides
    fun getRetrofit(url: String): Retrofit =
        Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    @Singleton
    fun getAPIService(retrofit: Retrofit): APIService =
        retrofit.create(APIService::class.java)

    @Provides
    fun providePostRepo(
        apiService: APIService
    ): PostRepo {
        return PostRepoImpl(apiService)
    }

}