package com.example.coupangeats

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.coupangeats.auth.Auth
import com.example.coupangeats.auth.AuthResponse
import com.example.coupangeats.auth.AuthService
import com.example.coupangeats.data.User
import com.example.coupangeats.databinding.ActivityLoginBinding
import com.example.coupangeats.databinding.ActivitySignupBinding
import com.example.coupangeats.util.saveJwt

class LoginActivity : AppCompatActivity(), LoginView{
    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.loginSignUpTv.setOnClickListener{
            startActivity(Intent(this, SignupActivity::class.java))
        }

        binding.loginLoginBtn.setOnClickListener{
            AuthService.login(this,getUser())
        }

        binding.loginCloseIv.setOnClickListener{
            finish()
        }

    }
    private fun getUser(): User {
        val email: String = binding.loginIdTv.text.toString()
        val pwd: String = binding.loginPwTv.text.toString()
        return User(email,pwd,"","")
    }

    override fun onLoginLoading() {
    }

    override fun onLoginSuccess(auth: Auth) {
        Toast.makeText(this,"로그인이 성공했습니다",Toast.LENGTH_SHORT).show()
        saveJwt(auth.jwt)
        startActivity(Intent(this, MainActivity::class.java))
    }


    override fun onLoginFailure(code:Int,message:String) {
        Log.d("code failure",message)
    }

}