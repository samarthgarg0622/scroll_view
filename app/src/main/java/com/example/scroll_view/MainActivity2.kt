package com.example.scroll_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras
        val name = bundle?.getString("FName")
        var hello_text = findViewById<TextView>(R.id.hello_name)
        hello_text?.apply {
            text = "hello $name"
        }
    }
}