package com.example.donutsapp.presentation.screens.storeScreen

import com.example.donutsapp.domain.entity.Donut
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

data class StoreScreenState (
    val id : Int = 0,
    val title: String ="",
    val description: String? = null,
    val image: Int? =null,
    val price: Int = 0,
    val salePrice: Int = 0,
    val isFavorite: Boolean  = false,
    var textFieldValue: String = "",
    val buttonEnabled: Boolean = false
)

