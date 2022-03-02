package com.example.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {

    private val TAG : String = this.javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        /**
         * Breakdown:
         *      Bundle extras = intent.extras
         *      if(extras != null){val a = extras.get("extra")}
         * */
        Log.d("TAG", intent.extras?.get("extra").toString())

        //Explicit intent in two
        var buttonInTwo : Button = findViewById(R.id.button_in_two)
        buttonInTwo.setOnClickListener {
            var intentInTwo = Intent(it.context, MainActivity::class.java)
            startActivity(intentInTwo)
        }
    }
}