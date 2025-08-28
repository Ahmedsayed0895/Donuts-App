package com.example.donutsapp.presentation.screens.storeScreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HeaderWithIcon(
    title: String,
    description: String,
    icon: Painter
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 36.dp, top = 81.dp, bottom = 54.dp, end = 36.dp),
        verticalAlignment = Alignment.CenterVertically

    ) {

        Column {
            Text(
                text = title,
                color = Color(0xFFFF7074),
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold,
                lineHeight = 36.sp
            )
            Text(
                text = description,
                color = Color(0x99000000),
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                lineHeight = 16.sp
            )

        }
        Spacer(Modifier.weight(1f))
        Box(
            modifier = Modifier
                .size(45.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color(0xFFFED8DF))
                .clickable { },
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = icon,
                contentDescription = "search icon",
                tint = Color(0xFFFF7074)
            )
        }

    }
}
