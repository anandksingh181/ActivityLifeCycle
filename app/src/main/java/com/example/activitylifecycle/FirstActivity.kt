package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.activitylifecycle.databinding.FirstPageBinding
import java.time.LocalDate
import kotlin.math.log

class FirstActivity : AppCompatActivity() {

    private lateinit var binding: FirstPageBinding

    val TAG: String ="Anand"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FirstPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(TAG,"OnCreate of first page")

//       val button = findViewById<Button>(R.id.button)

        binding.button.setOnClickListener {
            val intent = Intent(this@FirstActivity,SecondActivity::class.java)
            startActivity(intent)
        }
//
//        button.setOnClickListener {
//            val intent = Intent(this@FirstActivity,SecondActivity::class.java)
//            startActivity(intent)
//        }

        }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"OnStart of first page")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"OnResume of first page")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause of first page")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop of first page")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy of first page")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestart of first page")

    }

}

