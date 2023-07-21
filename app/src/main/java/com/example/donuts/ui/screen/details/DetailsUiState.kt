package com.example.donuts.ui.screen.details

/**
 * Created by Aziza Helmy on 7/20/2023.
 */
data class DetailsUiState(
    var image: Int = 0,
    val name: String = "",
    val price: String="",
    val description: String = "",
    val quantity: Int = 1,
    val isFavorite: Boolean = false
)