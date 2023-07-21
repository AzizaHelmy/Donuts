package com.example.donuts.ui.screen.details

import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.donuts.ui.navigation.Screen

/**
 * Created by Aziza Helmy on 7/15/2023.
 */
private val ROUTE = Screen.Details.route


fun NavController.navigateToDetails(name: String) {
    navigate("$ROUTE/$name")
}

fun NavGraphBuilder.detailsRoute() {
    composable(
        route = "$ROUTE/{${DetailsArgs.DOUNT_NAME}}",
        arguments = listOf(navArgument(DetailsArgs.DOUNT_NAME) {NavType.StringType})
    ) { DetailsScreen() }
}

class DetailsArgs(savedStateHandle: SavedStateHandle) {
    val name: String = checkNotNull(savedStateHandle[DOUNT_NAME])

    companion object {
        const val DOUNT_NAME = "DOUNT_NAME"
    }
}