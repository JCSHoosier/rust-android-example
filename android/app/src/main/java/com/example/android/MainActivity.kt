package com.example.android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        System.loadLibrary("rust")

        button_view.setOnClickListener {
            val rustResult = hello("World")
            text_view.text = rustResult
        }
    }

    external fun hello(to: String): String
}