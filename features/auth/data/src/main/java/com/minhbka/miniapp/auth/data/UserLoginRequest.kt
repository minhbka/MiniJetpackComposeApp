package com.minhbka.miniapp.auth.data

import kotlinx.serialization.Serializable

@Serializable
data class UserLoginRequest (
    val email:String,
    val password:String
)