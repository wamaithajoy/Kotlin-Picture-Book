package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page5 : AppCompatActivity() {
    lateinit var btnprevious5:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page5)
        btnprevious5=findViewById(R.id.btnprevious5)
        btnprevious5.setOnClickListener {
            val intent=Intent(this,Page4::class.java)
            startActivity(intent)
        }
    }
}