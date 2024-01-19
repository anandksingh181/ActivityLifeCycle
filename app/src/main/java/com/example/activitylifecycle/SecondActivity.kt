package com.example.activitylifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {

    val TAG: String ="Anand"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_page)
        Log.d(TAG, "OnCreate of second page")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "OnStart of second page")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "OnResume of second page")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "OnPause of second page")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "OnStop of second page")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "OnDestroy of second page")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Restart of second page")
    }
}