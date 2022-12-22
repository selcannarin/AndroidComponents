package com.selcannarin.androidcomponents

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class BroadcastReceiverActivity : AppCompatActivity() {
    lateinit var receiver: AirPlaneBroadcastReceiver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast_receiver)
        val show = findViewById<View>(R.id.button_show) as Button
        // setting on click event listener
        show.setOnClickListener {
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