package com.example.donutsapp.presentation.screens.storeScreen.components

import DonutsCard
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import com.example.donutsapp.presentation.screens.storeScreen.StoreScreenState
import com.example.donutsapp.presentation.screens.storeScreen.StoreScreenViewModel
import kotlin.uuid.ExperimentalUuidApi

@Composable
fun CardsHorizontalScroll(
    onFavoriteClick: (Int)-> Unit,
    state: List<StoreScreenState>,
) {

    LazyRow(
        contentPadding = PaddingValues(36.dp),
        horizontalArrangement = Arrangement.spacedBy(46.dp),

    ) {
        itemsIndexed(state) { index,currentDonut ->

            val cardBackground =
                if (index % 2 == 0) Color(0xFFD7E4F6) else Color(0xFFFED8DF)
            DonutsCard(
                donuts = currentDonut,
                backgroundColor = cardBackground,
                onFavoriteClick =  { onFavoriteClick(currentDonut.id) } ,
                onCardClick = { /* Handle card click */ },
                isFavorite = currentDonut.isFavorite,
                )

        }
    }
}
