package com.example.donuts.ui.screen.home

import com.example.donuts.R

/**
 * Created by Aziza Helmy on 7/15/2023.
 */
data class HomeUiState(
    val offers: List<OffersUiState> = listOf(OffersUiState(),OffersUiState()),
    val donuts: List<DonutsUiState> = emptyList()
)

data class OffersUiState(
    val image: Int = R.drawable.image_10,
    val name: String = "A chocolate-flavored donut.",
    val description: String = "These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
    val price: String = "25$",
    val discount: String = "20$",
    val isFavourite: Boolean = false
)

data class DonutsUiState(
    val image: Int = R.drawable.image_10,
    val name: String = "Chocolate Cherry",
    val price: String = "12$"
)