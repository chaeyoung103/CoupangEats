package com.example.coupangeats

import com.example.coupangeats.auth.AuthResponse

interface SignUpView {
    fun onSignUpLoading()
    fun onSignUpSuccess(response: AuthResponse)
    fun onSignUpFailure(code: Int, message: String)
}