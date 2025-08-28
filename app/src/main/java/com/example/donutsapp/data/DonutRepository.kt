package com.example.donutsapp.data

import com.example.donutsapp.domain.entity.Donut
import com.example.donutsapp.presentation.screens.storeScreen.StoreScreenState

class DonutRepository(val offerDonuts: List<StoreScreenState>) {

    fun getAllOfferedDonuts(): List<StoreScreenState> {
        return offerDonuts
    }
}