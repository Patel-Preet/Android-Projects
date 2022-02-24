package com.example.section3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlin.text.Typography.copyright

//Had to change compileSdkVersion and targetSdkVersion + https://stackoverflow.com/questions/68387270/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView:TextView = findViewById(R.id.textview)
        textView.text = "Welcome"


        var button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            var resultText: TextView = findViewById(R.id.resultTextView)    //Either declare type before
            var editText = findViewById<EditText>(R.id.edittext)         //Or later in <> brackets

            resultText.text = "Result: " + editText.text
            editText.text = null
        }

        //Alternative to add an image in ImageView
        var imageView: ImageView = findViewById(R.id.imageView)
        imageView.setImageResource(R.drawable.copyright)
    }


//Alternative for Click Event

//    fun submitForm(v: View){
//        var resultText: TextView = findViewById(R.id.resultTextView)    //Either declare type before
//        var editText = findViewById<EditText>(R.id.edittext)         //Or later in <> brackets
//
//        resultText.text = "Result: " + editText.text
//        editText.text = null
//    }
}