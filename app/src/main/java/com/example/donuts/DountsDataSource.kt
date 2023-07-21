package com.example.donuts

import com.example.donuts.ui.screen.details.DetailsUiState
import com.example.donuts.ui.screen.home.DonutsUiState
import com.example.donuts.ui.screen.home.OffersUiState
import com.example.donuts.ui.screen.home.toDetailsUiState

/**
 * Created by Aziza Helmy on 7/20/2023.
 */
object DountsDataSource {

    val dountOffers = listOf(
        OffersUiState(
            image = R.drawable.image_11,
            name = "Strawberry Wheel",
            description = "These Baked Strawberry Donuts.cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
            price = "10",
            discount = "$15"
        ),
        OffersUiState(
            image = R.drawable.image_7,
            name = "Chocolate Glaze",
            description = "A chocolate-flavored donut.These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
            price = "20",
            discount = "$25"
        ),
        OffersUiState(
            image = R.drawable.image_9,
            name = "Jelly Donut",
            description = "Moist and fluffy baked chocolate donutThese soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
            price = "30",
            discount = "$40"
        ),
        OffersUiState(
            image = R.drawable.image_10,
            name = "Old-Fashioned",
            description = "A simple donut covered in powdered sugarThese soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
            price = "20",
            discount = "$25"
        ),
        OffersUiState(
            image = R.drawable.image_11,
            name = "Apple Fritter",
            description = "Moist and fluffy baked chocolate donut.These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
            price = "60",
            discount = "$75"
        ),
        OffersUiState(
            image = R.drawable.image_10,
            name = "Powdered Sugar Donut",
            description = "A simple donut covered in powdered sugar.These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
            price = "20",
            discount = "$25"
        ),
        OffersUiState(
            image = R.drawable.image_8,
            name = "Chocolate Glaze",
            description = "These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
            price = "20",
            discount = "$25"
        ),
    )

    val donuts = listOf(
        DonutsUiState(
            image = R.drawable.image_8,
            name = "Chocolate Cherry",
            price = "$22"
        ),
        DonutsUiState(
            image = R.drawable.image_9,
            name = "Strawberry Rain",
            price = "$25"
        ),
        DonutsUiState(
            image = R.drawable.image_10,
            name = "Chocolate Cherry",
            price = "$45"
        ),
        DonutsUiState(
            image = R.drawable.image_11,
            name = "Chocolate Cherry",
            price = "$40"
        ),
        DonutsUiState(
            image = R.drawable.image_9,
            name = "Strawberry Rain",
            price = "$18"
        ),
        DonutsUiState(
            image = R.drawable.image_8,
            name = "Strawberry Rain",
            price = "$15"
        ),
        DonutsUiState(
            image = R.drawable.image_7,
            name = "Chocolate Cherry",
            price = "$20"
        ),
    )

    fun getDountByName(name: String, list: List<OffersUiState>): DetailsUiState? {
        return list.find { it.name == name }?.let(OffersUiState::toDetailsUiState)
    }
}