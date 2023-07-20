package com.example.donuts.ui.navigation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

/**
 * Created by Aziza Helmy on 7/15/2023.
 */

val localNavigationProvider =
    staticCompositionLocalOf<NavHostController> { error("No Navigation host controller provide!") }

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DonutsApp() {
    val navController = rememberNavController()
 /*   Scaffold(
        Modifier.fillMaxHeight(),
        bottomBar = {
            BottomBar(navController)
        }) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)){
            CompositionLocalProvider(localNavigationProvider provides rememberNavController()) {
                DonutsNavGraph()
            }
        }
    }*/
    CompositionLocalProvider(localNavigationProvider provides rememberNavController()) {
        DonutsNavGraph()
    }
}