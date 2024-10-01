package com.soviatul.recycle_buah_hewan_movie

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.soviatul.recycle_buah_hewan_movie.adapter.BukuAdapter
import com.soviatul.recycle_buah_hewan_movie.model.ModelBuku

class RecycleviewActivity : AppCompatActivity() {
    private lateinit var  rv_buku : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycleview)
        rv_buku = findViewById(R.id.rv_buku)

        //ini kita bikin array data
        val listBuku = listOf(
            ModelBuku(title = "Buku Android Kotlin 2024", penulis = "Rizki Syaputra"),
            ModelBuku(title = "Buku Android Kotlin2 2024", penulis = "Rizki Syaputra"),
            ModelBuku(title = "Buku Android Kotlin3 2024", penulis = "Rizki Syaputra"),
            ModelBuku(title = "Buku Android Kotlin4 2024", penulis = "Rizki Syaputra"),
            ModelBuku(title = "Buku Android Kotlin5 2024", penulis = "Rizki Syaputra"),
        )

        val nBukuAdapter = BukuAdapter(listBuku)
        rv_buku.apply {
            layoutManager = LinearLayoutManager(this@RecycleviewActivity)
            adapter = nBukuAdapter
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}