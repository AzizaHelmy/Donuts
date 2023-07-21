package com.example.donuts.ui.navigation

import com.example.donuts.R

/**
 * Created by Aziza Helmy on 7/15/2023.
 */

sealed class Screen(
    val route: String,
    val title: String = "",
    val selectedIcon: Int = 0,
    val notSelectedIcon: Int = R.drawable.icon_home
) {
    object OnBoarding : Screen(route = "OnBoarding")

    object Details : Screen(route = "Details")

    object Home : Screen(
        route = "Home",
        title = "Home",
        selectedIcon = R.drawable.icon_home_filled,
        notSelectedIcon = R.drawable.icon_home
    )

    object Favorites : Screen(
        route = "Favorites",
        title = "Favorites",
        selectedIcon = R.drawable.icon_heart_filled,
        notSelectedIcon = R.drawable.icon_heart
    )

    object Notification :
        Screen(
            route = "Notification",
            title = "Notification",
            selectedIcon = R.drawable.icon_notification_filled,
            notSelectedIcon = R.drawable.icon_notification
        )

    object Cart : Screen(
        route = "Cart",
        title = "Cart",
        selectedIcon = R.drawable.icon_buy_filled,
        notSelectedIcon = R.drawable.icon_buy
    )

    object Profile :
        Screen(
            route = "Profile",
            title = "Profile",
            selectedIcon = R.drawable.icon_user_filled,
            notSelectedIcon = R.drawable.icon_user
        )
}

