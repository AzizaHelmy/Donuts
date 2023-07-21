package com.example.donuts.ui.navigation

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

/**
 * Created by Aziza Helmy on 7/15/2023.
 */

val localNavigationProvider = staticCompositionLocalOf<NavHostController> {
    error("No Navigation host controller provide!")
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DonutsApp() {
    CompositionLocalProvider(localNavigationProvider provides rememberNavController()) {
        // DonutsTheme() {
        val bottomNavState = checkBottomBarState()
        Scaffold(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            bottomBar = {
                myBottomNavigation(bottomNavState = bottomNavState)
            }
        ) { innerPadding ->
            Box(modifier = Modifier.padding(innerPadding)) {
                DonutsNavGraph()
            }
        }
        //  }
    }
}


@Composable
private fun checkBottomBarState(): MutableState<Boolean> {
    val navController = localNavigationProvider.current
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val bottomBarState = rememberSaveable { (mutableStateOf(true)) }

    val bottomBarScreens = listOf(
        Screen.Home.route,
        Screen.Favorites.route,
        Screen.Notification.route,
        Screen.Cart.route,
        Screen.Profile.route
    )

    when (navBackStackEntry?.destination?.route) {
        in bottomBarScreens -> {
            // Show BottomBar
            bottomBarState.value = true
        }

        else -> {
            // Hide BottomBar
            bottomBarState.value = false
        }
    }
    return bottomBarState
}

