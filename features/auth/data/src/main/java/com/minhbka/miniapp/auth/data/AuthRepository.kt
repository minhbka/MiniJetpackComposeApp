package com.minhbka.miniapp.auth.data

import com.minhbka.miniapp.network.NetworkResult
import com.minhbka.miniapp.network.Response

interface AuthRepository {
    suspend fun login(request:UserLoginRequest): NetworkResult<Response<UserApiModel>>
}