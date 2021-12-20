package com.example.viewmodelscopedemo.model

import kotlinx.coroutines.delay

class UserRepository {

    suspend fun getUsers() : List<User> {
        delay(8000)
        val user : List<User> = listOf(
            User(1,"Sadaqat"),
            User(2,"Ali"),
            User(3,"Panhwer"),
            User(4,"ABC"),
        )
        return user
    }

}