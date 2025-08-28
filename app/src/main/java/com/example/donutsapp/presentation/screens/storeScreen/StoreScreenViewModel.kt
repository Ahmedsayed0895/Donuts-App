package com.example.donutsapp.presentation.screens.storeScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.donutsapp.data.DonutRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class StoreScreenViewModel(private val donutRepository: DonutRepository) : ViewModel() {
    private var _state = MutableStateFlow(StoreScreenState())
    val state = _state.asStateFlow()

    init {
        getOfferedDonuts()
    }


    fun getOfferedDonuts() {
        viewModelScope.launch(Dispatchers.IO) {
            val donuts = donutRepository.getAllOfferedDonuts()
            _state.value = _state.value.copy(offerDonuts = donuts)
        }
    }


    fun onFavoriteClick(id: Int) {
        _state.update {
            val updatedDonuts = it.offerDonuts.map { donut ->
                if (donut.id == id) {
                    donut.copy(isFavorite = !donut.isFavorite)
                } else {
                    donut
                }
            }
            it.copy(offerDonuts = updatedDonuts)
        }

        }

    }



