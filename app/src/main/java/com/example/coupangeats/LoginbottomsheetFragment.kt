package com.example.coupangeats

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.coupangeats.databinding.FragmentLoginbottomsheetBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class LoginbottomsheetFragment() : BottomSheetDialogFragment()  {

    lateinit var binding: FragmentLoginbottomsheetBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        var view = inflater.inflate(R.layout.fragment_loginbottomsheet, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn1 = view.findViewById<Button>(R.id.dialog_coupang_login_btn)
        val btn2 = view.findViewById<Button>(R.id.dialog_id_login_btn)

        btn2.setOnClickListener {
            val main = activity as MainActivity

            main.moveLogin()

        }
    }

}