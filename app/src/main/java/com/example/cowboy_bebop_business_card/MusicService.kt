package com.example.cowboy_bebop_business_card

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.util.Log

class MusicService : Service() {

    private lateinit var mediaPlayer: MediaPlayer

    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()

        mediaPlayer = MediaPlayer.create(this, R.raw.tank)
        mediaPlayer.isLooping = true // Зацикливаем песню
        mediaPlayer.start()
    }

    override fun onDestroy() {

        mediaPlayer.setOnErrorListener { mp, what, extra ->
            Log.e("MusicService", "Error occurred while playing audio.")
            true // Если ошибка обработана
        }

        super.onDestroy()
        mediaPlayer.stop()
        mediaPlayer.release()
    }
}
