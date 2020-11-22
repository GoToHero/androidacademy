package ru.go2hero.androidacademy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textButton = findViewById<TextView>(R.id.textButton)
        textButton.setOnClickListener {
            startActivity(Intent(this, MovieDetailsActivity::class.java))
        }
    }
}