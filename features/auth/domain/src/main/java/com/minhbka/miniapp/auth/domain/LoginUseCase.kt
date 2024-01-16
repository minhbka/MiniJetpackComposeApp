package com.minhbka.miniapp.auth.domain

import com.minhbka.miniapp.auth.data.AuthRepository
import com.minhbka.miniapp.auth.data.UserLoginRequest
import com.minhbka.miniapp.network.NetworkException
import com.minhbka.miniapp.network.NetworkResult
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val repository: AuthRepository,
    private val mapper: UserMapper
){
    suspend fun invoke(email:String, password:String):Resource<User>{
        val request = UserLoginRequest(email, password)

        return when(val result = repository.login(request)){
            is NetworkResult.Error -> result.toResourceError()

            is NetworkResult.Success -> {
                Resource.Success(mapper.map(result.result.data))
            }
        }
    }
}

fun NetworkResult.Error<*>.toResourceError() : Resource.Error{
    return when(exception){

        is NetworkException.NotFoundException -> Resource.Error(ResourceError.SERVICE_UNAVAILABLE)
        is NetworkException.UnauthorizedException -> Resource.Error(ResourceError.UNAUTHORIZED)
        else -> Resource.Error(ResourceError.UNKNOWN)

    }
}