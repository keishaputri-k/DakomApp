package com.kei.dakomapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kei.dakomapp.databinding.ActivityLandingScreenBinding


class LandingScreen : AppCompatActivity(), View.OnClickListener{
    private lateinit var landingBinding : ActivityLandingScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        landingBinding = ActivityLandingScreenBinding.inflate(layoutInflater)
        setContentView(landingBinding.root)
        supportActionBar?.hide()

        landingBinding.btnLoginLanding.setOnClickListener(this)
        landingBinding.btnRegisterLanding.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id){
            R.id.btnLoginLanding -> startActivity(Intent(LoginActivity.getLaunchService(this)))
            R.id.btnRegisterLanding -> startActivity(Intent(RegisterActivity.getLaunchService(this)))
        }
    }
}