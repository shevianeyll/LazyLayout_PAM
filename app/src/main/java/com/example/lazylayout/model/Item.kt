package com.example.lazylayout.model

import com.example.lazylayout.R

data class Item(
    val id: Int,
    val name: String,
    val imageRes: Int
)

val itemList = listOf(
    Item(1, "Item Satu", R.drawable.gambar1),
    Item(2, "Item Dua", R.drawable.gambar2),
    Item(3, "Item Tiga", R.drawable.gambar3),
    Item(4, "Item Empat", R.drawable.gambar4),
    Item(5, "Item Lima", R.drawable.gambar5)
)