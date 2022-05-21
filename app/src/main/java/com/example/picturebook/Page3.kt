package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page3 : AppCompatActivity() {
    lateinit var btnNextthree:Button
    lateinit var btnprevioustwo:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)
        btnNextthree=findViewById(R.id.btnNextthree)
        btnNextthree.setOnClickListener {
            val intent=Intent(this,Page4::class.java)
            startActivity(intent)
        }
        btnprevioustwo=findViewById(R.id.btnPrevioustwo)
        btnprevioustwo.setOnClickListener {
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}