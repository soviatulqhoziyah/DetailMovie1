package com.soviatul.recycle_buah_hewan_movie.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.soviatul.recycle_buah_hewan_movie.R
import com.soviatul.recycle_buah_hewan_movie.model.ModelBuku

class BukuAdapter  (private val buku: List<ModelBuku>) :
    RecyclerView.Adapter<BukuAdapter.BukuAdapterHolder>() {


    class BukuAdapterHolder(view: View) : RecyclerView.ViewHolder(view){
        val txtJudul : TextView = view.findViewById(R.id.txtJudulBuku)
        val txtPenulis : TextView = view.findViewById(R.id.txtPenulis)
    }
    override fun onBindViewHolder(holder: BukuAdapterHolder, position: Int) {

        holder.txtPenulis.text = buku[position].penulis
        holder.txtJudul.text = buku[position].title
    }
    //membuat layout list item sebagai item dari recycle view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BukuAdapterHolder {

        val  view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return  BukuAdapterHolder(view)
    }
    override fun getItemCount(): Int{
        return buku.size
    }
}