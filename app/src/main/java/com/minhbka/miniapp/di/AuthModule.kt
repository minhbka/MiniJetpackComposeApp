package com.minhbka.miniapp.di

import com.minhbka.miniapp.auth.data.AuthRepository
import com.minhbka.miniapp.auth.data.AuthRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@InstallIn(ViewModelComponent::class)
@Module
class AuthModule {
    @Provides
    fun provideAuthRepository(impl: AuthRepositoryImpl): AuthRepository = impl
}