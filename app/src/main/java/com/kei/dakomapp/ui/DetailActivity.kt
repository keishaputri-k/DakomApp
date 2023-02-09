package com.kei.dakomapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kei.dakomapp.R

class DetailActivity : AppCompatActivity() {
    companion object{
        const val Lectures = "LECTURE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }
}