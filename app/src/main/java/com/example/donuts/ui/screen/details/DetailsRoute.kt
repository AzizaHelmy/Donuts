package com.example.donuts.ui.screen.details

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.donuts.ui.navigation.Screen

/**
 * Created by Aziza Helmy on 7/15/2023.
 */
private val ROUTE = Screen.Details.route


fun NavController.navigateToDetails() {
    navigate(ROUTE)
}
/*fun NavController.navigateToDetails(id:Int) {
    navigate("$ROUTE/$id")
}*/

fun NavGraphBuilder.detailsRoute() {
    composable(ROUTE) { DetailsScreen() }
}