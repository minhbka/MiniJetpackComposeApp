package com.minhbka.miniapp.auth.domain

interface Mapper<F, T> {
    fun map(from:F): T
}