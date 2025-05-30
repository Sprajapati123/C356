package com.example.c36a.repository

import com.example.c36a.model.UserModel
import com.google.firebase.auth.FirebaseUser

interface UserRepository {
    // login
    //register,
    //forgetpassword
    //updateProfile
    //getCurrentUser
    //addUserToDatabase
    //logout
//    {
//        "success" : true,
//        "message" : "Registration success",
//    "userId":"dafsgdhfdsfa"
//    }
    fun login(
        email: String, password: String,
        callback: (Boolean, String) -> Unit
    )

    //authentication function
    fun register(
        email: String, password: String,
        callback: (Boolean, String, String) -> Unit
    )

    //database function
    fun addUserToDatabase(
        userId: String, model: UserModel,
        callback: (Boolean, String) -> Unit
    )

    fun forgetPassword(
        email: String, callback: (Boolean, String) -> Unit
    )

    fun getCurrentUser(): FirebaseUser?


    fun logout(callback: (Boolean, String) -> Unit)
}