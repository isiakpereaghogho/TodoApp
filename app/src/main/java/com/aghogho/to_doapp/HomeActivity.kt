package com.aghogho.to_doapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    private lateinit var usernameDisplay: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        usernameDisplay = findViewById(R.id.usernameDisplay)

        usernameDisplay.text = "WELCOME, ${intent.getStringExtra("name")}"

    }
}