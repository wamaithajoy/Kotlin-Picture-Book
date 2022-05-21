package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnNextone:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNextone=findViewById(R.id.btnNextone)
        btnNextone.setOnClickListener {
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

    }
}