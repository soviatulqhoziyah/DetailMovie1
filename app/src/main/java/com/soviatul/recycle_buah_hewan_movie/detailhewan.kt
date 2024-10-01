package com.soviatul.recycle_buah_hewan_movie

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class detailhewan : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailhewan)

        val tvNamaHewan = findViewById<TextView>(R.id.tvNamaHewan)
        val tvCiriHewan = findViewById<TextView>(R.id.tvCiriHewan)
        val txtTinggi = findViewById<TextView>(R.id.txtTinggi)
        val txtBerat = findViewById<TextView>(R.id.txtBerat)
        val detailhewan = findViewById<ImageView>(R.id.detailhewan)

        // Mendapatkan data yang dikirim dari ListView
        val namaHewan = intent.getStringExtra("namaHewan")
        val ciriHewan = intent.getStringExtra("ciriHewan")
        val tinggiHewan = intent.getStringExtra("tinggiHewan")
        val beratHewan = intent.getStringExtra("beratHewan")
        val gambarHewan = intent.getIntExtra("gambarHewan", 0)

        // Menampilkan data di TextView
        tvNamaHewan.text = namaHewan
        tvCiriHewan.text = ciriHewan
        txtTinggi.text = tinggiHewan
        txtBerat.text = beratHewan

        detailhewan.setImageResource(gambarHewan)

    }
}