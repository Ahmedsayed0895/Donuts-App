package com.example.tomandjerry.screens.donuts_screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import com.example.donutsapp.R
import com.example.donutsapp.presentation.screens.storeScreen.StoreScreenState
import com.example.donutsapp.presentation.screens.storeScreen.components.SmallCardsHorizontalScroll
import com.example.donutsapp.presentation.screens.storeScreen.StoreScreenViewModel
import com.example.donutsapp.presentation.screens.storeScreen.components.CardsHorizontalScroll
import com.example.donutsapp.presentation.screens.storeScreen.components.HeaderWithIcon
import com.example.donutsapp.presentation.screens.storeScreen.components.Title
import org.koin.compose.viewmodel.koinViewModel
import kotlin.uuid.ExperimentalUuidApi

@Composable
fun StoreScreen(
    viewModel: StoreScreenViewModel = koinViewModel()

) {
    val state by viewModel.state.collectAsState()
    StoreContent(
        state = state,
        onFavoriteClick = viewModel::onFavoriteClick,
    )
}

@Composable
private fun StoreContent(
    state: List<StoreScreenState>,
    onFavoriteClick:(Int)-> Unit
) {
    Scaffold(
        containerColor = Color(0xFFfcfcfc),
        modifier = Modifier.safeDrawingPadding(),
        bottomBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFfcfcfc))
                    .padding(top = 16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                IconButton(
                    colors = IconButtonDefaults.iconButtonColors(),
                    onClick = {},


                    ) {
                    Icon(
                        modifier = Modifier.size(30.dp),
                        painter = painterResource(R.drawable.home),
                        contentDescription = "home icon",
                        tint = Color(0xFFFC6F73)
                    )
                }
                IconButton(
                    onClick = {},

                    ) {
                    Icon(
                        modifier = Modifier.size(30.dp),
                        painter = painterResource(R.drawable.heart),
                        contentDescription = "home icon",
                        tint = Color(0xFFFC6F73)
                    )
                }
                IconButton(
                    onClick = {},

                    ) {
                    Icon(
                        modifier = Modifier.size(30.dp),
                        painter = painterResource(R.drawable.notification_red_icon),
                        contentDescription = "home icon",
                        tint = Color(0xFFFC6F73)
                    )
                }
                IconButton(
                    onClick = {},

                    ) {
                    Icon(
                        modifier = Modifier.size(30.dp),
                        painter = painterResource(R.drawable.buy),
                        contentDescription = "home icon",
                        tint = Color(0xFFFC6F73)
                    )
                }
                IconButton(
                    onClick = {},

                    ) {
                    Icon(
                        modifier = Modifier.size(30.dp),
                        painter = painterResource(R.drawable.person),
                        contentDescription = "home icon",
                        tint = Color(0xFFFC6F73)
                    )
                }


            }
        }
    ) { contentPadding ->
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
                .padding(contentPadding)
        ) {
            HeaderWithIcon(
                title = "Let’s Gonuts!",
                description = "Order your favourite donuts from here",
                icon = painterResource(R.drawable.donuts_search_icon)
            )
            Title(text = "Today Offers")
            CardsHorizontalScroll(
                onFavoriteClick = onFavoriteClick,
                state = state,
            )
            Title(text = "Donuts")
            SmallCardsHorizontalScroll()
        }
    }
}



