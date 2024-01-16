package com.minhbka.miniapp.auth.domain

import com.minhbka.miniapp.auth.data.UserApiModel
import javax.inject.Inject

class UserMapper @Inject constructor():Mapper<UserApiModel, User> {
    override fun map(from: UserApiModel): User {
        return User(
            avatar = from.avatar,
            email = from.email,
            createdAt = from.createdAt,
            fullName = from.fullName,
            id = from.id
        )
    }

}