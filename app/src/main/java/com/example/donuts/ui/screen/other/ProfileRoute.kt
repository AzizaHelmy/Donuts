package com.example.donuts.ui.screen.other


import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.donuts.ui.navigation.Screen

/**
 * Created by Aziza Helmy on 7/21/2023.
 */

private val ROUTE = Screen.Profile.route

fun NavGraphBuilder.profileRoute() {
    composable(ROUTE) { ProfileScreen() }
}