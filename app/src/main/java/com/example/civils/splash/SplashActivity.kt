package com.example.civils.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.example.civils.R
import com.example.civils.ui.HomeActivity

class SplashActivity : AppCompatActivity(),SplashView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        showHomeScreen()
    }

    override fun showHomeScreen() {
        Handler().postDelayed({
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }, 2000)
    }

}