package com.example.activitylifecycle

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.Window
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val TAG : String = this.javaClass.simpleName    //Java - this.getClass().getSimpleName()

    //Note: If you change the orientation - it will call onPause() -> onStop() -> onDestroy() -> onCreate() -> onStart() -> onResume()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        Log.d(TAG, "onCreate() called")

        var buttonInOne : Button = findViewById(R.id.button_in_one)

        //For Explicit Intent
//        buttonInOne.setOnClickListener {
//            var intentInOne = Intent(it.context, SecondActivity::class.java)
//            intentInOne.putExtra("extra", "Message from activity 1")
//            startActivity(intentInOne)
//        }

        //For Implicit Intent
//        buttonInOne.setOnClickListener {
//            var implicitIntent : Intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
//            startActivity(implicitIntent)
//        }
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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val mInflater: MenuInflater = MenuInflater(this)
        mInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.toast -> Toast.makeText(this, "Toast", Toast.LENGTH_LONG).show()
            R.id.log -> Log.d(TAG, "Log")
            else -> {
                super.onOptionsItemSelected(item)
            }
        }
        return true
    }
}