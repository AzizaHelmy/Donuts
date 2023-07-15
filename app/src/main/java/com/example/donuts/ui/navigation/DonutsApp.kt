package com.example.donuts.ui.navigation

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
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
    CompositionLocalProvider(localNavigationProvider provides rememberNavController()) {
        DonutsNavGraph()
    }
}