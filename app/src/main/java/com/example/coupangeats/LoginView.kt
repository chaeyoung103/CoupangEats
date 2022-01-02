package com.example.coupangeats

import com.example.coupangeats.auth.Auth

interface LoginView {
    fun onLoginLoading()
    fun onLoginSuccess(auth: Auth)
    fun onLoginFailure(code: Int, message: String)
}