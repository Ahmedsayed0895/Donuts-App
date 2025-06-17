package com.example.tomandjerry.composable.donuts

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.washingtondcsquad.tudee.presentation.utils.modifierExensions.dropShadow


@Composable
fun DonutsSmallCard(
    title:String,
    price:Int,
    image: Painter,
) {
    Box(
        modifier = Modifier
            .padding(start = 8.dp, end = 8.dp, top = 47.dp, bottom = 24.dp),
        contentAlignment = Alignment.Center

    ) {
        Box(
            modifier = Modifier
                .width(140.dp)
                .dropShadow(
                    color = Color(0xFF000000).copy(0.10f),
                    blur = 150.dp,
                    shape = RoundedCornerShape(
                        topStart = 20.dp,
                        topEnd = 20.dp,
                        bottomStart = 10.dp,
                        bottomEnd = 10.dp
                    ),
                )

                .clip(
                    RoundedCornerShape(
                        topStart = 20.dp,
                        topEnd = 20.dp,
                        bottomStart = 10.dp,
                        bottomEnd = 10.dp
                    ),
                )
                .background(Color.White)
                .clickable {  }
                .padding(start = 8.dp, end = 8.dp, top = 47.dp, bottom = 24.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(

                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = title,
                    color = Color(0x99000000),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    lineHeight = 17.sp
                )
                Spacer(Modifier.height(10.dp))
                Text(
                    text = "$$price",
                    color = Color(0xFFff7074),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    lineHeight = 17.sp
                )
            }
        }

        Image(
            painter = image,
            contentDescription = "donut picture",
            modifier = Modifier.offset(y = (-70).dp)
        )
    }
}
