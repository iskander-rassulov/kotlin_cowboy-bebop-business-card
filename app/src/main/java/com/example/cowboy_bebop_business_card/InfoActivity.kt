package com.example.cowboy_bebop_business_card

import ScreenSlidePagerAdapter
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class InfoActivity : AppCompatActivity(){
    private lateinit var viewPager: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_info)

        val homeButton: ImageButton = findViewById(R.id.homeButton)
        homeButton.setOnClickListener {
            Log.d("InfoActivity", "Home button clicked")
            // Запуск MainActivity
            val intent = Intent(this@InfoActivity, MainActivity::class.java)
            // Если MainActivity уже запущена, вместо запуска нового экземпляра, просто покажем ее из стека
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
            finish()
        }

        viewPager = findViewById(R.id.viewPager)
        viewPager.adapter = ScreenSlidePagerAdapter(this)

    }
}