package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Flag : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flag)
        var btnNext2=findViewById<Button>(R.id.btnBackPres)
        var btnNext3=findViewById<Button>(R.id.btnNext3)

        btnNext2.setOnClickListener {
            var intent=Intent(baseContext,Flag::class.java)
                startActivity(intent)
        }
        btnNext3.setOnClickListener {
            var intent=Intent(baseContext,HomeCountry::class.java)
                startActivity(intent)
        }
    }
}