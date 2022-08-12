package com.test.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val shared = getString(com.test.resources.R.string.shared_text)
        val text = getString(com.test.resources.R.string.main_text)
        setContentView(R.layout.activity_main)
    }
}