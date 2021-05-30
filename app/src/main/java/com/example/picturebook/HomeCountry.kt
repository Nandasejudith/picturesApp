package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeCountry : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_country)
        var btnNext3=findViewById<Button>(R.id.btnBackFlag)
        var btnNext4=findViewById<Button>(R.id.btnNext4)
        btnNext3.setOnClickListener {
            var intent=Intent(baseContext,HomeCountry::class.java)
                startActivity(intent)
        }
        btnNext4.setOnClickListener {
            var intent=Intent(baseContext,StapleFood::class.java)
                 startActivity(intent)
        }
    }
}