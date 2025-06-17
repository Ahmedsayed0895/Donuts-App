package com.example.tomandjerry.screens.donuts_screens

import android.annotation.SuppressLint
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donutsapp.R


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ProductScreen(){

    Scaffold (
        containerColor = Color(0xFFFED8DF),
        topBar = {
            Image(
                painter = painterResource(R.drawable.arrow_back),
                contentDescription = "arrow back icon" ,
                
                 modifier = Modifier
                     .padding(start = 40.dp, top = 45.dp)
                     .clickable { }

            )
        }
    ){
        Box(
            Modifier.verticalScroll(rememberScrollState())
        ){
            Image(
                painter = painterResource(R.drawable.strawberry_wheel),
                contentDescription = "strawberry wheel"
            )
            Column {
                Spacer(Modifier.height(350.dp))
                Box( modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 50.dp),) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
                            .background(Color.White),
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(vertical = 36.dp, horizontal = 40.dp)
                        ) {
                            Text(
                                text = "Strawberry Wheel",
                                color = Color(0xFFFF7074),
                                fontSize = 30.sp,
                                fontWeight = FontWeight.SemiBold,
                                lineHeight = 36.sp
                            )
                            Spacer(Modifier.height(33.dp))
                            Text(
                                text = "About Gonut",
                                color = Color(0xCC000000),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Medium,
                                lineHeight = 22.sp
                            )
                            Spacer(Modifier.height(16.dp))
                            Text(
                                text = "These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
                                color = Color(0x99000000),
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Medium,
                                lineHeight = 17.sp,
                            )
                            Spacer(Modifier.height(24.dp))

                            Text(
                                text = "Quantity",
                                color = Color(0xCC000000),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Medium,
                                lineHeight = 22.sp
                            )
                            Spacer(Modifier.height(18.dp))

                            Row(
                                modifier = Modifier.width(180.dp),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(45.dp)
                                        .shadow(elevation = 15.dp, spotColor = Color(0x40000000))
                                        .clip(RoundedCornerShape(16.dp))
                                        .background(Color.White)
                                        .clickable { },
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = "-",
                                        color = Color(0xCC000000),
                                        fontSize = 32.sp,
                                        fontWeight = FontWeight.Medium,
                                        lineHeight = 39.sp
                                    )
                                }

                                Box(
                                    modifier = Modifier
                                        .size(45.dp)
                                        .shadow(elevation = 15.dp, spotColor = Color(0x40000000))
                                        .clip(RoundedCornerShape(16.dp))
                                        .background(Color.White),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = "1",
                                        color = Color(0xCC000000),
                                        fontSize = 22.sp,
                                        fontWeight = FontWeight.Medium,
                                        lineHeight = 29.sp
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .size(45.dp)
                                        .shadow(elevation = 15.dp, spotColor = Color(0x40000000))
                                        .clip(RoundedCornerShape(16.dp))
                                        .background(Color.Black)
                                        .clickable { },
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = "+",
                                        color = Color(0xffffffff),
                                        fontSize = 32.sp,
                                        fontWeight = FontWeight.Medium,
                                        lineHeight = 39.sp
                                    )
                                }


                            }
                            Spacer(Modifier.height(34.dp))
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically

                            ) {
                                Text(
                                    text = "£16",
                                    color = Color(0xFF000000),
                                    fontSize = 30.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    lineHeight = 36.sp
                                )
                                Spacer(Modifier.width(24.dp))


                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .clip(RoundedCornerShape(50.dp))
                                        .clickable { }
                                        .background(Color(0xFFFF7074))
                                        .padding(vertical = 24.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = "Add to Cart",
                                        color = Color(0xFFffffff),
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.SemiBold,
                                        lineHeight = 24.sp
                                    )

                                }
                            }


                        }

                    }
                    Image(
                        painter = painterResource(R.drawable.heart_box),
                        contentDescription = "add to favorite icon",
                        modifier = Modifier

                            .align(Alignment.TopEnd)
                            .offset(y = (-65).dp, x = 10.dp)

                    )
                }
            }
        }


    }

}