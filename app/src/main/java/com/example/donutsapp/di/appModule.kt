package com.example.donutsapp.di

import com.example.StoreScreenStateapp.data.offerDonuts
import com.example.donutsapp.data.DonutRepository
import com.example.donutsapp.presentation.screens.storeScreen.StoreScreenViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single { DonutRepository(offerDonuts) }
    viewModel { StoreScreenViewModel(get()) }
}