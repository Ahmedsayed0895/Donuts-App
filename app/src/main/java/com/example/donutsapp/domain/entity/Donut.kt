package com.example.donutsapp.domain.entity

data class Donut(
    val id: String,
    val title: String,
    val description: String,
    val image: Int,
    val price: Int,
    val salePrice: Int,
)