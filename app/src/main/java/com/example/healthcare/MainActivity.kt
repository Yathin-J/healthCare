package com.example.healthcare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcare.R

class MainActivity : AppCompatActivity() {
    private lateinit var aBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityMainBinding.inflate(layoutInflater).also{aBinding = it}.root)
    }
}