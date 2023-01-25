package com.selcannarin.androidcomponents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.selcannarin.androidcomponents.databinding.ActivityServiceBinding

class ServiceActivity : AppCompatActivity() {
    private lateinit var binding : ActivityServiceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityServiceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // setting on click event listener
        binding.buttonStart.setOnClickListener {
            startService(Intent(this, RingToneService::class.java))
        }

        // setting on click event listener
        binding.buttonStop.setOnClickListener {
            stopService(Intent(this, RingToneService::class.java))
        }

    }
}