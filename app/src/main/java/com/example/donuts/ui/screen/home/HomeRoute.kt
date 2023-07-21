package com.example.donuts.ui.screen.home

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.donuts.ui.navigation.Screen

/**
 * Created by Aziza Helmy on 7/15/2023.
 */

private val ROUTE = Screen.Home.route


fun NavController.navigateToHome() {
    navigate(ROUTE)
}

fun NavGraphBuilder.homeRoute() {
    composable(ROUTE) { HomeScreen() }
}
