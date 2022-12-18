package com.selcannarin.androidcomponents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b1 = findViewById<View>(R.id.button_activity) as Button
        // setting on click event listener
        b1.setOnClickListener {
            val intent = Intent(this@MainActivity, Activity_activity::class.java)
            startActivity(intent)
        }

        val b2 = findViewById<View>(R.id.button_service) as Button
        // setting on click event listener
        b2.setOnClickListener {
            val intent = Intent(this@MainActivity, Activity_service::class.java)
            startActivity(intent)
        }

        val b3 = findViewById<View>(R.id.button_contentP) as Button
        // setting on click event listener
        b3.setOnClickListener {
            val intent = Intent(this@MainActivity, Activity_contentProvider::class.java)
            startActivity(intent)
        }

        val b4 = findViewById<View>(R.id.button_broadcastR) as Button
        // setting on click event listener
        b4.setOnClickListener {
            val intent = Intent(this@MainActivity, Activity_broadcastReceiver::class.java)
            startActivity(intent)
        }
    }


}




