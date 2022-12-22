package com.selcannarin.androidcomponents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ServiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)

        val start = findViewById<View>(R.id.button_start) as Button
        // setting on click event listener
        start.setOnClickListener {
            startService(Intent(this, RingToneService::class.java))
        }

        val stop = findViewById<View>(R.id.button_stop) as Button
        // setting on click event listener
        stop.setOnClickListener {
            stopService(Intent(this, RingToneService::class.java))
        }

    }
}