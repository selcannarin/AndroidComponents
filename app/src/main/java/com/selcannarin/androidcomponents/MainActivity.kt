package com.selcannarin.androidcomponents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.selcannarin.androidcomponents.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // val b1 = findViewById<View>(R.id.button_activity) as Button
        // setting on click event listener
        binding.buttonActivity.setOnClickListener {
            val intent = Intent(this@MainActivity, ActivityActivity::class.java)
            startActivity(intent)
        }

        // val b2 = findViewById<View>(R.id.button_service) as Button
        // setting on click event listener
        binding.buttonService.setOnClickListener {
            val intent = Intent(this@MainActivity, ServiceActivity::class.java)
            startActivity(intent)
        }

        // val b3 = findViewById<View>(R.id.button_content_provider) as Button
        // setting on click event listener
        binding.buttonContentProvider.setOnClickListener {
            val intent = Intent(this@MainActivity, ContentProviderActivity::class.java)
            startActivity(intent)
        }

        // val b4 = findViewById<View>(R.id.button_broadcast_receiver) as Button
        // setting on click event listener
        binding.buttonBroadcastReceiver.setOnClickListener {
            val intent = Intent(this@MainActivity, BroadcastReceiverActivity::class.java)
            startActivity(intent)
        }


    }

}





