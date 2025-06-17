package com.example.tomandjerry.composable.donuts

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donutsapp.R
import com.washingtondcsquad.tudee.presentation.utils.modifierExensions.dropShadow


@Composable
fun DonutsCard(
    title:String,
    description:String,
    oldPrice:Int,
    discountPrice:Int,
    donutImage: Painter,
    backgroundColor: Color
) {
    Box(
        modifier = Modifier.width(200.dp)

    ) {
        Column(
            modifier = Modifier
                .width(193.dp)
                .dropShadow(
                    color = Color(0xFF000000).copy(0.25f),
                    blur = 4.dp,
                    shape = RoundedCornerShape(20.dp),
                )
                .clip(RoundedCornerShape(20.dp))
                .background(backgroundColor)
                .clickable {  }
                .padding(15.dp)

        ) {
            Image(
                painter = painterResource(R.drawable.donut_favorit),
                contentDescription = "favorite icon",
            )
            Spacer(Modifier.height(118.dp))
            Text(
                text = title,
                color = Color(0xFF000000),
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
            )
            Spacer(Modifier.height(8.dp))
            Text(
                text = description,
                color = Color(0x99000000),
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                lineHeight = 15.sp
            )
            Spacer(Modifier.height(4.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.Bottom
            ) {
                Text(
                    text = "$$oldPrice",
                    color = Color(0x99000000),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    lineHeight = 17.sp,
                    textDecoration = TextDecoration.LineThrough
                )
                Spacer(Modifier.width(4.dp))

                Text(
                    text = "$$discountPrice",
                    color = Color(0xFF000000),
                    fontSize = 22.sp,
                    fontWeight = FontWeight.SemiBold,
                    lineHeight = 27.sp
                )
            }


        }
        Image(
            painter = donutImage,
            contentDescription = "Strawberry donuts",
            modifier = Modifier.offset(x = 60.dp)

        )
    }
}