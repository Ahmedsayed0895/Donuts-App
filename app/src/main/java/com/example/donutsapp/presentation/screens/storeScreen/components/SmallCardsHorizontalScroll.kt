package com.example.donutsapp.presentation.screens.storeScreen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.StoreScreenStateapp.data.donuts
import com.example.tomandjerry.composable.donuts.DonutsSmallCard
import kotlin.uuid.ExperimentalUuidApi


@OptIn(ExperimentalUuidApi::class)
@Composable fun SmallCardsHorizontalScroll() {
    LazyRow(
        contentPadding = PaddingValues(36.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(donuts.size) {
            DonutsSmallCard(
                title = donuts[it].title,
                price = donuts[it].price,
                image = painterResource(donuts[it].image!!),
            )
        }

    }
}