package com.example.coupangeats

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.coupangeats.auth.AuthResponse
import com.example.coupangeats.auth.AuthService
import com.example.coupangeats.data.User
import com.example.coupangeats.databinding.ActivitySignupBinding
import com.example.coupangeats.util.saveJwt

class SignupActivity : AppCompatActivity(),SignUpView{
    lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.signupSignupBtn.setOnClickListener{
            AuthService.signUp(this,getUser())
        }

    }
    private fun getUser(): User {
        val email: String = binding.signupIdTv.text.toString()
        val pwd: String = binding.signupPwTv.text.toString()
        val name: String = binding.signupNameTv.text.toString()
        val phone: String = binding.signupPhoneTv.text.toString()

        return User(email,pwd,name,phone)
    }

    override fun onSignUpLoading() {

    }

    override fun onSignUpSuccess(response: AuthResponse) {
        Toast.makeText(this,"회원가입이 성공했습니다",Toast.LENGTH_SHORT).show()
        response.result?.let { saveJwt(it.jwt) }
    }

    override fun onSignUpFailure(code: Int, message: String) {
        Log.d("code failure",message)
    }

}