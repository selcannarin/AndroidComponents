package com.selcannarin.androidcomponents

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.selcannarin.androidcomponents.databinding.ActivityBroadcastReceiverBinding

class BroadcastReceiverActivity : AppCompatActivity() {
    lateinit var receiver: AirPlaneBroadcastReceiver
    private lateinit var binding: ActivityBroadcastReceiverBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBroadcastReceiverBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // setting on click event listener
        binding.buttonShow.setOnClickListener {
            receiver = AirPlaneBroadcastReceiver()
            // Intent Filter is useful to determine which apps wants to receive
            // which intents,since here we want to respond to change of
            // airplane mode
            IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
                // registering the receiver
                // it parameter which is passed in  registerReceiver() function
                // is the intent filter that we have just created
                registerReceiver(receiver, it)
            }
        }
    }
    // since AirplaneModeChangeReceiver class holds a instance of Context
    // and that context is actually the activity context in which
    // the receiver has been created
    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
    }
}