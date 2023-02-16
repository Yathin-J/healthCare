package com.example.healthcare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcare.R

class LoginActivity : AppCompatActivity() {
    private lateinit var aBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityLoginBinding.inflate(layoutInflater).also { aBinding = it }.root)

    }
}