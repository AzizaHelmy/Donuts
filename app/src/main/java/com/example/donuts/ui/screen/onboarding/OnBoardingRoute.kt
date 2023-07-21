package com.example.donuts.ui.screen.onboarding

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.donuts.ui.navigation.Screen

/**
 * Created by Aziza Helmy on 7/15/2023.
 */

private val ROUTE=Screen.OnBoarding.route

fun NavController.navigateToOnBoard() {
    navigate(ROUTE)
}

fun NavGraphBuilder.onBoardRoute() {
    composable(ROUTE) { OnBoardingScreen() }
}