package com.tennis.kmpapp2

import com.tennis.kmpapp2.data.Product
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class HomeViewmodel: ViewModel() {
    private val _products = MutableStateFlow<List<Product>>(listOf())
    val products = _products.asStateFlow()

    private val home_repository = Homerepository()


    init {
        viewModelScope.launch {
            home_repository.getProducts().collect{
                products ->
                _products.update { it + products }
            }
        }
    }
}