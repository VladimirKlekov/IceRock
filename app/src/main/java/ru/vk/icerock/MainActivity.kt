package ru.vk.icerock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.vk.icerock.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.firstBtn.setOnClickListener {
            val intent = Intent(this, RotatingActivity::class.java)
            intent.putExtra("screenOrientation", "portrait")
            startActivity(intent)
        }

        binding.secondBtn.setOnClickListener {
            val intent = Intent(this, RotatingActivity::class.java)
            intent.putExtra("screenOrientation", "landscape")
            startActivity(intent)
        }

    }
}