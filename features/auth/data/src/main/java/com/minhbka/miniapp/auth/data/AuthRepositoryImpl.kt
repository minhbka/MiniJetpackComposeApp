package com.minhbka.miniapp.auth.data

import com.minhbka.miniapp.network.NetworkResult
import com.minhbka.miniapp.network.RequestHandler
import com.minhbka.miniapp.network.Response
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val requestHandler: RequestHandler
) : AuthRepository {

    override suspend fun login(request: UserLoginRequest): NetworkResult<Response<UserApiModel>> {
        return requestHandler.post(
            urlPathSegments = listOf("auth", "login"),
            body = request,

        )
    }
}