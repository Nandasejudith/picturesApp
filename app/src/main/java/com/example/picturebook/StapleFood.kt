package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StapleFood : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_staple_food)


        var btnNext4=findViewById<Button>(R.id.btnBackHome)
        btnNext4.setOnClickListener {

       }
    }
}