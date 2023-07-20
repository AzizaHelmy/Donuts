package com.example.donuts.ui.screen.home

import com.example.donuts.R
import com.example.donuts.ui.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.update
import javax.inject.Inject

/**
 * Created by Aziza Helmy on 7/15/2023.
 */

@HiltViewModel
class HomeViewModel @Inject constructor() : BaseViewModel<HomeUiState>(HomeUiState()) {

    init {
        getDonutsOffers()
        getDonuts()
    }

    private fun getDonutsOffers() {
        _state.update {
            it.copy(
                offers = listOf(
                    OffersUiState(
                        image = R.drawable.image_11,
                        name = "Strawberry Wheel",
                        description = "These Baked Strawberry Donuts.cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
                        price = "$20",
                        discount = "$15"
                    ),
                    OffersUiState(
                        image = R.drawable.image_7,
                        name = "Chocolate Glaze",
                        description = "A chocolate-flavored donut.These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
                        price = "$30",
                        discount = "$25"
                    ),
                    OffersUiState(
                        image = R.drawable.image_9,
                        name = "Jelly Donut",
                        description = "Moist and fluffy baked chocolate donutThese soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
                        price = "$45",
                        discount = "$40"
                    ),
                    OffersUiState(
                        image = R.drawable.image_10,
                        name = "Old-Fashioned",
                        description = "A simple donut covered in powdered sugarThese soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
                        price = "$25",
                        discount = "$15"
                    ),
                    OffersUiState(
                        image = R.drawable.image_11,
                        name = "Apple Fritter",
                        description = "Moist and fluffy baked chocolate donut.These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
                        price = "$100",
                        discount = "$75"
                    ),
                    OffersUiState(
                        image = R.drawable.image_10,
                        name = "Powdered Sugar Donut",
                        description = "A simple donut covered in powdered sugar.These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
                        price = "$40",
                        discount = "$20"
                    ),
                    OffersUiState(
                        image = R.drawable.image_8,
                        name = "Chocolate Glaze",
                        description = "These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
                        price = "$30",
                        discount = "$25"
                    ),
                )
            )
        }
    }

    private fun getDonuts() {
        _state.update {
            it.copy(
                donuts = listOf(
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
            )
        }
    }
}