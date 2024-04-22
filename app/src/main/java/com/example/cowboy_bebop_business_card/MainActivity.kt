package com.example.cowboy_bebop_business_card

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        // Находим кнопку по её ID
        val mainButton: ImageButton = findViewById(R.id.main_button)
        mainButton.setOnClickListener {
            // Запуск InfoActivity
            val intent = Intent(this, InfoActivity::class.java)
            startActivity(intent)
        }
        }
    }
