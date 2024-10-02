package com.tennis.kmpapp2

import com.tennis.kmpapp2.apiClient.httpClient
import com.tennis.kmpapp2.data.Product
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsChannel
import kotlinx.coroutines.flow.flow

class Homerepository {
    suspend fun getProductsApi(): List<Product>{
        val response = httpClient.get("https://fakestoreapi.com/products")
        return response.body()
    }

    fun getProducts() = flow<List<Product>> {
        emit(getProductsApi())
    }
}