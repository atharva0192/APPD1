package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            Toast.makeText(this,"zoro.to currently under construction",Toast.LENGTH_SHORT).show()

            val intent = Intent(this@MainActivity,SplashActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}