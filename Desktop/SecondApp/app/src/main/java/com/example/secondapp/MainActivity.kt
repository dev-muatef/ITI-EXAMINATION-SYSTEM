package com.example.secondapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.btn_show)
        val textView: TextView = findViewById(R.id.tv_hello)
        val editText: EditText = findViewById(R.id.et_name)

        button.setOnClickListener{
            val name = editText.text
            if(name.isNullOrEmpty()  )
                textView.text = "Enter your name"
            else
                textView.text = "hello ${name}"
        }
    }
}