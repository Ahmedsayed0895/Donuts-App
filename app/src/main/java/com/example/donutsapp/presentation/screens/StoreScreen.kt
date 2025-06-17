package com.example.tomandjerry.screens.donuts_screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donutsapp.R
import com.example.tomandjerry.composable.donuts.DonutsCard
import com.example.tomandjerry.composable.donuts.DonutsSmallCard


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun StoreScreen(){
    Scaffold (
        containerColor = Color(0xFFfcfcfc),
        modifier = Modifier.safeDrawingPadding(),
        bottomBar = {
            Row (
                modifier = Modifier.fillMaxWidth()
                    .background(Color(0xFFfcfcfc))
                    .padding(top = 16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Image(
                    modifier = Modifier.clickable {  },
                    painter = painterResource(R.drawable.home),
                    contentDescription = "home icon"
                )
                Image(
                    modifier = Modifier.clickable {  },
                    painter = painterResource(R.drawable.heart),
                    contentDescription = "home icon"
                )
                Image(
                    modifier = Modifier.clickable {  },
                    painter = painterResource(R.drawable.notification_red_icon),
                    contentDescription = "home icon"
                )
                Image(
                    modifier = Modifier.clickable {  },
                    painter = painterResource(R.drawable.buy),
                    contentDescription = "home icon"
                )
                Image(
                    modifier = Modifier.clickable {  },
                    painter = painterResource(R.drawable.person),
                    contentDescription = "home icon"
                )
            }
        }
    ){
        Column (
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(start = 36.dp)
                .fillMaxSize()

        ){
            Row(
                modifier = Modifier
                    .width(350.dp)
                    .padding(top = 81.dp, bottom = 54.dp),
                verticalAlignment = Alignment.CenterVertically

            ) {

                Column {
                    Text(
                        text = "Let’s Gonuts!",
                        color = Color(0xFFFF7074),
                        fontSize = 30.sp,
                        fontWeight = FontWeight.SemiBold,
                        lineHeight = 36.sp
                    )
                    Text(
                        text = "Order your favourite donuts from here",
                        color = Color(0x99000000),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium,
                        lineHeight = 16.sp
                    )

                }
                Spacer(Modifier.weight(1f))
                Box (
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color(0xFFFED8DF))
                        .clickable {  }
                        .padding(4.dp),
                    contentAlignment = Alignment.Center
                ){
                    Icon(
                        painter = painterResource(R.drawable.donuts_search_icon),
                        contentDescription = "search icon",
                        tint = Color(0xFFFF7074)
                    )
                }

            }

            Text(
                text = "Today Offers",
                color = Color(0xFF000000),
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                lineHeight = 24.sp
            )
            Spacer(Modifier.height(24.dp))

            Row (
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState())
            ){
                DonutsCard(
                    title = "Strawberry Wheel",
                    description = "These Baked Strawberry Donuts are filled with fresh strawberries...",
                    oldPrice = 20,
                    discountPrice = 16,
                    donutImage = painterResource(R.drawable.strawberry_donuts),
                    backgroundColor = Color(0xFFD7E4F6)
                )
                Spacer(Modifier.width(46.dp))


                DonutsCard(
                    title = "Chocolate Glaze",
                    description = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
                    oldPrice = 20,
                    discountPrice = 16,
                    donutImage = painterResource(R.drawable.chocolate_donut),
                    backgroundColor = Color(0xFFffc7d0)
                )
                Spacer(Modifier.width(46.dp))

            }

            Spacer(Modifier.height(46.dp))

            Text(
                text = "Donuts",
                color = Color(0xFF000000),
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                lineHeight = 24.sp
            )
            Spacer(Modifier.height(32.dp))

            Row (
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState())
            ){
                DonutsSmallCard(
                    title = "Chocolate Cherry",
                    price = 22,
                    image = painterResource(R.drawable.chocolate_cherry),
                )
                DonutsSmallCard(
                    title = "Strawberry Rain",
                    price = 22,
                    image = painterResource(R.drawable.strawberry_rain),
                )
                DonutsSmallCard(
                    title = "Strawberry",
                    price = 22,
                    image = painterResource(R.drawable.strawberry),
                )

            }
            Spacer(Modifier.height(32.dp))




        }


    }

}
