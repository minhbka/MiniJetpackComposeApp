package com.minhbka.miniapp.di

import com.minhbka.miniapp.BuildConfig
import com.minhbka.miniapp.network.MiniAppHttpClientBuilder
import com.minhbka.miniapp.network.RequestHandler
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.HttpClient
import io.ktor.http.URLProtocol

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {
    @Provides
    fun provideHttpClient(): HttpClient =
        MiniAppHttpClientBuilder().protocol(URLProtocol.HTTP).host(BuildConfig.MINI_APP_HOST).build()

    @Provides
    fun provideRequestHandler(client: HttpClient) = RequestHandler(client)
}