package com.example.donutsapp.presentation.screens.storeScreen

import androidx.lifecycle.ViewModel
import com.example.donutsapp.data.DonutRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class StoreScreenViewModel(private val donutRepository: DonutRepository) : ViewModel() {
    private var _state = MutableStateFlow(donutRepository.getAllOfferedDonuts())
    val state = _state.asStateFlow()

    init {
        getOfferedDonuts()
    }


    fun getOfferedDonuts() = donutRepository.getAllOfferedDonuts()


    fun onFavoriteClick(id: Int) {
        _state.update { donuts ->
            donuts.map { donut ->
                if (donut.id == id) {
                    donut.copy(isFavorite = !donut.isFavorite)
                } else {
                    donut
                }
            }
        }

    }
}


