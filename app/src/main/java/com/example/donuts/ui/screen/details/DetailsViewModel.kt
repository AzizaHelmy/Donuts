package com.example.donuts.ui.screen.details

import com.example.donuts.ui.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Created by Aziza Helmy on 7/20/2023.
 */

@HiltViewModel
class DetailsViewModel @Inject constructor() : BaseViewModel<DetailsUiState>(DetailsUiState()),
    DetailsInteractionsListener {


}