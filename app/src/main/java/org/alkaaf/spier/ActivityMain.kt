package org.alkaaf.spier

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ActivityMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startService(Intent(this, ServiceWa::class.java))
    }
}