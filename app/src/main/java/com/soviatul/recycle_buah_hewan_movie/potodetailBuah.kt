package com.soviatul.recycle_buah_hewan_movie

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class potodetailBuah : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_potodetail_buah)

        val imageResId = intent.getIntExtra("imageResId", 0)
        val  judul = intent.getStringExtra("deskripsi")

        val imageView = findViewById<ImageView>(R.id.imgbuahdetail)
        val textViewTitle = findViewById<TextView>(R.id.txtnamaBuah)

        imageView.setImageResource(imageResId)
        textViewTitle.text = judul ?: "No Title"

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}