package com.example.donuts.ui.screen.details

import androidx.lifecycle.SavedStateHandle
import com.example.donuts.DountsDataSource
import com.example.donuts.ui.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.update
import javax.inject.Inject

/**
 * Created by Aziza Helmy on 7/20/2023.
 */

@HiltViewModel
class DetailsViewModel @Inject constructor(savedStateHandle: SavedStateHandle) :
    BaseViewModel<DetailsUiState>(DetailsUiState()),
    DetailsInteractionsListener {
    val args = DetailsArgs(savedStateHandle)

    init {
        getDountDetails(args.name)
    }

    private fun getDountDetails(name: String) {
        val donutItems = DountsDataSource.dountOffers
        val dountItem = DountsDataSource.getDountByName(name, donutItems)
        _state.update {
            it.copy(
                image = dountItem?.image ?: 0,
                price = dountItem?.price ?: "",
                description = dountItem?.description ?: "",
                name = dountItem?.name ?: ""
            )
        }
    }

    override fun onClickIncrease() {
        _state.update { it.copy(quantity = it.quantity.plus(1)) }
    }

    override fun onClickDecrease() {
        _state.update {
            it.copy(
                quantity = if (_state.value.quantity > 1) it.quantity.minus(1) else 1
            )
        }
    }

    override fun onClickFavorite() {
        _state.update { it.copy(isFavorite = !it.isFavorite) }
    }

    override fun onClickAddToCart() {}


}