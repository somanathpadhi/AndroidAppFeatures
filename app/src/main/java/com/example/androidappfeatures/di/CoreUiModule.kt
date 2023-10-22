package com.example.androidappfeatures.di

import com.example.androidappfeatures.common.CoroutineContextProvider
import com.example.androidappfeatures.common.CoroutineContextProviderImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal class CoreUiModule {
    @Singleton
    @Provides
    fun provideCoroutineContextProvider(): CoroutineContextProvider = CoroutineContextProviderImpl()
}