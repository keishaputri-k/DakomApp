package com.kei.dakomapp.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kei.dakomapp.R
import com.kei.dakomapp.ui.mainFragment.HomeFragment
import kotlinx.android.synthetic.main.activity_notification.*

class NotificationActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        fun getLaunchService (from: Context) = Intent(from, NotificationActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)
        supportActionBar?.hide()
        ivBackNotification.setOnClickListener (this)

    }

    override fun onClick(p0: View) {
        when (p0.id) {
            R.id.ivBackNotification -> backHome()
        }
    }

    private fun backHome() {
        val intent = Intent(this, MainActivity::class.java)
        this.startActivity(intent)
    }
}