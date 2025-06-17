package com.example.donutsapp

import android.os.Bundle
import android.util.proto.ProtoOutputStream
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.donutsapp.ui.theme.DonutsAppTheme
import com.example.tomandjerry.screens.donuts_screens.ProductScreen
import com.example.tomandjerry.screens.donuts_screens.StoreScreen
import com.example.tomandjerry.screens.donuts_screens.WelcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DonutsAppTheme {
                //ProductScreen()
               // StoreScreen()
                WelcomeScreen()

            }
        }
    }
}
