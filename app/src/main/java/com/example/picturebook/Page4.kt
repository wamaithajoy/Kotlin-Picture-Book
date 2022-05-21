package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page4 : AppCompatActivity() {
    lateinit var btnNextfour:Button
    lateinit var btnperiod3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)
        btnNextfour=findViewById(R.id.btnNextfour)
        btnNextfour.setOnClickListener {
            val intent=Intent(this,Page5::class.java)
            startActivity(intent)
        }
       btnperiod3=findViewById(R.id.btnprevious3)
        btnperiod3.setOnClickListener {
            val intent=Intent(this,Page3::class.java)
            startActivity(intent)
        }
    }
}