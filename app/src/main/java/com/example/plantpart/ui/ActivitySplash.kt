package com.example.plantpart.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.plantpart.ActivityLogin
import com.example.plantpart.R

class ActivitySplash  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_splash)

        Handler().postDelayed({

            startActivity(Intent(this , ActivityLogin::class.java))

            finish ()
        },8000)

    }
}