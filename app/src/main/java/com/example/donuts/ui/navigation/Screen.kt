package com.example.donuts.ui.navigation

import com.example.donuts.R

/**
 * Created by Aziza Helmy on 7/15/2023.
 */

sealed class Screen(
    val route: String,
    title: String = "",
    icon: Int = 0
) {
    object OnBoarding : Screen(route = "OnBoarding")

    object Details : Screen(route = "Details")

    object Home : Screen(route = "Home", title = "Home", icon = R.drawable.icon_home)

    object Favorites :
        Screen(route = "Favorites", title = "Favorites", icon = R.drawable.icon_heart)

    object Notification :
        Screen(
            route = "Notification",
            title = "Notification",
            icon = R.drawable.icon_notification
        )

    object Cart : Screen(route = "Cart", title = "Cart", icon = R.drawable.icon_buy)

    object Profile :
        Screen(route = "Profile", title = "Profile", icon = R.drawable.icon_user)
}

