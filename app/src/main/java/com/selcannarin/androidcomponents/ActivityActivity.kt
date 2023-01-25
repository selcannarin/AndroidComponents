package com.selcannarin.androidcomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.selcannarin.androidcomponents.databinding.ActivityActivityBinding

class ActivityActivity : AppCompatActivity() {
    private lateinit var binding: ActivityActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // setting on click event listener
        binding.buttonStart.setOnClickListener { Toast.makeText(applicationContext, "Activity is working.", Toast.LENGTH_LONG).show() }
    }


}

