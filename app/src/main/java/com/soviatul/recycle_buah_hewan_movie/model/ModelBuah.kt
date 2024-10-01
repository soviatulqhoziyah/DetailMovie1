package com.soviatul.recycle_buah_hewan_movie.model

import com.soviatul.recycle_buah_hewan_movie.R

data class ModelBuah(
    val image: Int, val deskripsi : String
)
//array data
object MockList{
    fun getModel() : List<ModelBuah>{
        val itemModel1 = ModelBuah(
            R.drawable.apple,
            "Apple"
        )
        val itemModel2 = ModelBuah(
            R.drawable.grapes,
            "Anggur"
        )
        val itemModel3 = ModelBuah(
            R.drawable.orange,
            "jeruk"
        )
        val itemModel4 = ModelBuah(
            R.drawable.pear,
            "Pear"
        )
        val itemModel5 = ModelBuah(
            R.drawable.strawberry,
            "Strawberry"
        )

        val itemList : ArrayList<ModelBuah> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)

        return itemList

    }
}
