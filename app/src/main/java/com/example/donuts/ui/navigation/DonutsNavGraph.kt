package com.example.donuts.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import com.example.donuts.ui.screen.details.detailsRoute
import com.example.donuts.ui.screen.home.homeRoute
import com.example.donuts.ui.screen.onboarding.onBoardRoute

/**
 * Created by Aziza Helmy on 7/15/2023.
 */

@Composable
fun DonutsNavGraph() {

    val navController = localNavigationProvider.current

    NavHost(navController = navController, startDestination = Screen.OnBoarding.route) {
        onBoardRoute()
        homeRoute()
        detailsRoute()
    }

}