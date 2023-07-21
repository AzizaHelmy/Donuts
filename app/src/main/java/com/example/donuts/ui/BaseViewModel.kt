package com.example.donuts.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

/**
 * Created by Aziza Helmy on 7/15/2023.
 */

abstract class BaseViewModel<T> (initialUiState: T) : ViewModel() {

    protected val _state:MutableStateFlow<T> by lazy { MutableStateFlow(initialUiState) }
    val state:StateFlow<T> by lazy { _state.asStateFlow() }

    protected fun updateState(block:(T)->T){
        _state.update { block(it) }
    }

}