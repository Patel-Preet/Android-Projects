package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private val TAG : String = this.javaClass.simpleName    //Java - this.getClass().getSimpleName()

    //Note: If you change the orientation - it will call onPause() -> onStop() -> onDestroy() -> onCreate() -> onStart() -> onResume()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate() called")

        //For Explicit Intent
        var buttonInOne : Button = findViewById(R.id.button_in_one)
        buttonInOne.setOnClickListener {
            var intentInOne = Intent(it.context, SecondActivity::class.java)
            intentInOne.putExtra("extra", "Message from activity 1")
            startActivity(intentInOne)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() called")
    }
}