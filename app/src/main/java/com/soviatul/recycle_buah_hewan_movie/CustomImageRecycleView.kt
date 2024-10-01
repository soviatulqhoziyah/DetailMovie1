package com.soviatul.recycle_buah_hewan_movie

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.soviatul.recycle_buah_hewan_movie.adapter.BuahAdapter
import com.soviatul.recycle_buah_hewan_movie.model.MockList
import com.soviatul.recycle_buah_hewan_movie.model.ModelBuah

class CustomImageRecycleView : AppCompatActivity() {
    private lateinit var rv_buah : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_custom_image_recycle_view)
        rv_buah = findViewById(R.id.rv_data)

        rv_buah.layoutManager = GridLayoutManager(this,1,
            GridLayoutManager.VERTICAL,false)



        val adapter = BuahAdapter(MockList.getModel() as ArrayList<ModelBuah>, this)
        rv_buah.adapter = adapter







        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}