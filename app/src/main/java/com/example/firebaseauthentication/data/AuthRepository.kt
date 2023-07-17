package com.example.firebaseauthentication.data

import com.google.firebase.auth.AuthResult
import kotlinx.coroutines.flow.Flow

interface AuthRepository {

    fun loginUSer(email:String ,password: String): Flow<Resource<AuthResult>>
     fun registerUser (email:String ,password: String): Flow<Resource<AuthResult>>
}