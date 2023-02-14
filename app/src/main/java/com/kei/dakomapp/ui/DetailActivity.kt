package com.kei.dakomapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kei.dakomapp.R
import com.kei.dakomapp.model.LectureItem
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_LECTURE = "extra_lectures"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.hide()
        val data = intent.getParcelableExtra<LectureItem>("EXTRA_NEWS") as LectureItem
        tvTitleDetail.text = data.name.toString()


    }

}