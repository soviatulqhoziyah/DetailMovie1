package com.soviatul.recycle_buah_hewan_movie

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailMovie : AppCompatActivity() {
    private lateinit var txtDetailMovie : TextView
    private lateinit var imgDetailMovie : ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_movie)

        txtDetailMovie = findViewById(R.id.txtDetailMovie)
        imgDetailMovie = findViewById(R.id.imgDetailMovie)

        //get data
        val detailText = intent.getStringExtra("deskripsi")
        val detailImage = intent.getIntExtra("image", 0)

        //set data ke layout
        txtDetailMovie.setText(detailText)
        imgDetailMovie.setImageResource(detailImage)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}