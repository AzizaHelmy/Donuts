package com.example.donuts.ui.navigation

/**
 * Created by Aziza Helmy on 7/20/2023.
 */

import android.annotation.SuppressLint
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.BottomNavigation
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.donuts.ui.theme.Primary
import com.example.donuts.ui.theme.Red
import com.example.donuts.ui.theme.Secondary

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun myBottomNavigation(bottomNavState: MutableState<Boolean>) {
    val navController = rememberNavController()

    val screens = listOf(
        Screen.Home,
        Screen.Cart,
        Screen.Notification,
        Screen.Favorites,
        Screen.Profile,
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    AnimatedVisibility(
        visible = bottomNavState.value,
        enter = slideInVertically(initialOffsetY = { it }),
        exit = slideOutVertically(targetOffsetY = { it }),
        content = {
            BottomNavigation( backgroundColor = Color.White) {
                screens.forEach { screen ->
                    AddItem(
                        screen = screen,
                        currentDestination = currentDestination,
                        navController = navController
                    )
                }
            }

        }
    )
}

@Composable
fun RowScope.AddItem(
    screen: Screen,
    currentDestination: NavDestination?,
    navController: NavHostController
) {

    NavigationBarItem(
        icon = {
            val isSelected = currentDestination?.hierarchy?.any { it.route == screen.route } == true

            Icon(
                painter = painterResource(id = if (isSelected) screen.selectedIcon else screen.notSelectedIcon),
                contentDescription = null,
                tint = Red
            )
        },
        selected = currentDestination?.hierarchy?.any {
            it.route == screen.route
        } == true,
        colors = NavigationBarItemDefaults.colors(
            indicatorColor = Color.White,
            selectedIconColor = Primary,
            unselectedIconColor = Color.Black
        ),
        onClick = {
           /* navController.navigate(screen.route) {
                popUpTo(navController.graph.findStartDestination().id) {
                    saveState = true
                }
                launchSingleTop = true
                restoreState = true
            }*/
        }
    )
}
