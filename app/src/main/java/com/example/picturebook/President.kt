package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class President : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_president)
        var btnNext1 =findViewById<Button>(R.id.btnNext1)
        var btnNext2=findViewById<Button>(R.id.btnNext2)
        btnNext1.setOnClickListener {
            var intent= Intent(baseContext,President::class.java)
                startActivity(intent)
        }
        btnNext2.setOnClickListener {
            var intent=Intent(baseContext,Flag::class.java)
                startActivity(intent)
        }
    }
}