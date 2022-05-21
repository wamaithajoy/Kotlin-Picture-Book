package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    lateinit var btnnext2:Button
    lateinit var btnprevious1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btnnext2=findViewById(R.id.btnnext2)
        btnnext2.setOnClickListener {
          val intent=Intent(this,Page3::class.java)
            startActivity(intent)
        }
        btnprevious1=findViewById(R.id.btnprevious1)
        btnprevious1.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}