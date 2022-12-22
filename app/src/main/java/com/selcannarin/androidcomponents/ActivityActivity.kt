package com.selcannarin.androidcomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class ActivityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity)
        val b = findViewById<View>(R.id.button_start) as Button
        // setting on click event listener
        b.setOnClickListener { Toast.makeText(applicationContext, "Activity is working.", Toast.LENGTH_LONG).show() }
    }


}

