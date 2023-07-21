package com.example.donuts.ui.screen.home

import com.example.donuts.DountsDataSource
import com.example.donuts.ui.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.update
import javax.inject.Inject

/**
 * Created by Aziza Helmy on 7/15/2023.
 */

@HiltViewModel
class HomeViewModel @Inject constructor() :
    BaseViewModel<HomeUiState>(HomeUiState()),
    HomeInteractionsListener {

    init {
        getDonutsOffers()
        getDonuts()
    }

    private fun getDonutsOffers() {
        _state.update {
            it.copy(offers = DountsDataSource.dountOffers)
        }
    }

    private fun getDonuts() {
        _state.update {
            it.copy(donuts = DountsDataSource.donuts)
        }
    }

    override fun onClickFavorite(position: Int) {
        val currentState = _state.value

        val updatedDonutOffers = currentState.offers.mapIndexed { index, donutUiState ->
            if (index == position) {
                donutUiState.copy(isFavourite = !donutUiState.isFavourite)
            } else {
                donutUiState
            }
        }
        val updatedState = currentState.copy(offers = updatedDonutOffers)
        _state.value = updatedState

    }

    override fun onClickDonutOffer() {}


}