package com.example.ciproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lib.SDK

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SDK().sayHello()
    }
}