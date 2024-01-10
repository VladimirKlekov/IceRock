package ru.vk.icerock

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RotatingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_rotating)

        when (intent.getStringExtra("screenOrientation")) {
            "portrait" -> {
                setContentView(R.layout.activity_first_rotating)
                requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED
            }
            "landscape" -> {
                setContentView(R.layout.activity_second_rotating)
                requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
            }
        }
    }
}