package com.soviatul.recycle_buah_hewan_movie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.soviatul.recycle_buah_hewan_movie.adapter.MovieAdapter
import com.soviatul.recycle_buah_hewan_movie.model.ModelMovie

class RecycleViewCardMovie : AppCompatActivity() {
    private var recycleview: RecyclerView? = null
    private var movieAdapter: MovieAdapter? = null
    private var movieList = mutableListOf<ModelMovie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view_card_movie)

        // Inisialisasi RecyclerView
        recycleview = findViewById(R.id.rv_movie)

        // Set adapter
        movieAdapter = MovieAdapter(this, movieList) { position ->
            // Menampilkan dialog gambar detail ketika item di-klik
        }

        // Set layout manager untuk Grid
        val layoutManager = GridLayoutManager(this, 2)
        recycleview!!.layoutManager = layoutManager
        recycleview!!.adapter = movieAdapter

        // Mengatur window insets (jika diperlukan)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Memanggil fungsi untuk menyiapkan daftar movie
        prepareMovieList()
    }

    // Fungsi untuk menyiapkan data movie
    private fun prepareMovieList() {
        movieList.add(ModelMovie("Avatar", R.drawable.avatar, "27 November 2023", getString(R.string.sinopsis1)))
        movieList.add(ModelMovie("Batman", R.drawable.batman, "26 Oktober 2023", getString(R.string.sinopsis1)))
        movieList.add(ModelMovie("End Game", R.drawable.end_game, "01 Januari 2024", getString(R.string.sinopsis2)))
        movieList.add(ModelMovie("Hulk", R.drawable.hulk, "06 Juli 2023", getString(R.string.sinopsis3)))
        movieList.add(ModelMovie("Inception", R.drawable.inception, "06 Juli 2023", getString(R.string.sinopsis4)))
        movieList.add(ModelMovie("Jumanji", R.drawable.jumanji, "01 Agustus 2023", getString(R.string.sinopsis3)))
        movieList.add(ModelMovie("Lucy", R.drawable.lucy, "08 Juli 2023", getString(R.string.sinopsis5)))
        movieList.add(ModelMovie("Jurassic World", R.drawable.jurassic_world, "06 Juli 2023", getString(R.string.sinopsis3)))
        movieList.add(ModelMovie("Spider Man", R.drawable.spider_man, "06 Juli 2023", getString(R.string.sinopsis4)))
        movieList.add(ModelMovie("Venom", R.drawable.venom, "16 Juni 2023", getString(R.string.sinopsis5)))

        // Beritahu adapter untuk memperbarui tampilan
        movieAdapter!!.notifyDataSetChanged()
    }
}
