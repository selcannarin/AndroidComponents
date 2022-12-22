package com.selcannarin.androidcomponents

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast


class AirPlaneBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // intent contains the information about the broadcast
        // in our case broadcast is change of airplane mode

        // if getBooleanExtra contains null value,it will directly return back
        val isAirplaneModeEnabled = intent?.getBooleanExtra("state", false) ?: return

        // checking whether airplane mode is enabled or not
        if (isAirplaneModeEnabled) {
            // showing the toast message if airplane mode is enabled
            Toast.makeText(context, "Airplane Mode Enabled", Toast.LENGTH_LONG).show()
        } else {
            // showing the toast message if airplane mode is disabled
            Toast.makeText(context, "Airplane Mode Disabled", Toast.LENGTH_LONG).show()
        }

    }
}