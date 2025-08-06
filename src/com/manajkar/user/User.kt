package com.manajkar.user

data class User(
    val username: String,
    val password: String,
    val email: String,
    val tanggalGabung: String,
    val role: Role
)
