package com.example.donutsapp.presentation.screens.storeScreen.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
 fun Title(
    text: String
) {
    Text(
        text = text,
        color = Color(0xFF000000),
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 24.sp,
        modifier = Modifier.padding(start = 36.dp)
    )
}