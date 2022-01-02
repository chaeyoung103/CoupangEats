package com.example.coupangeats.auth

import com.example.coupangeats.data.User
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface AuthRetrofitInterface {
    @POST("app/user")
    fun signUp(@Body user: User): Call<AuthResponse>

    @POST("app/login")
    fun login(@Body user: User): Call<AuthResponse>

    @GET("app/logout")
    fun logout(@Body user: User): Call<AuthResponse>
//
//    @GET("/users/auto-login")
//    fun autoLogin(): Call<AuthResponse>
}