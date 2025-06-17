package com.example.tomandjerry.screens.donuts_screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donutsapp.R
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun WelcomeScreen(){
    Scaffold (
        containerColor = Color(0xFFFED8DF),
        modifier = Modifier.fillMaxHeight()
    ){
        Box(
        ){
           Image(
               painter = painterResource(R.drawable.donats),
               contentDescription = "donuts image"
           )
           Column (
               modifier = Modifier
                   .fillMaxHeight()
                   .padding(horizontal = 40.dp)

           ){
               Spacer(Modifier.height(451.dp))

               Text(
                   text = "Gonuts with Donuts",
                   color = Color(0xFFFF7074),
                   fontSize = 54.sp ,
                   fontWeight = FontWeight.Bold ,
                   modifier = Modifier.width(193.dp),
                   lineHeight = 65.sp
               )
               Spacer(Modifier.height(19.dp))

               Text(
                   text = "Gonuts with Donuts is a Sri Lanka dedicated food outlets for specialize manufacturing of Donuts in Colombo, Sri Lanka.",
                   color = Color(0xFFFF9494),
                   fontSize = 18.sp ,
                   fontWeight = FontWeight.Medium ,
                   lineHeight = 22.sp
               )
               Spacer(Modifier.fillMaxHeight(0.25f))
               Box(
                   modifier = Modifier.fillMaxWidth()
                       .clip(RoundedCornerShape(50.dp))
                       .clickable {  }
                       .background(Color.White)
                       .padding(vertical = 22.dp)
                       ,
                   contentAlignment = Alignment.Center
               ){
                   Text(
                       text = "Get Started",
                       color = Color(0xFF000000),
                       fontSize = 20.sp ,
                       fontWeight = FontWeight.SemiBold ,
                       lineHeight = 24.sp
                   )
               }


           }
        }


    }

}