package com.tennis.kmpapp2.apiClient

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

//val httpClient = HttpClient{
//    install(ContentNegotiation){
//        json(Json {
//            prettyPrint = true
//            ignoreUnknownKeys = true
//        })
//    }
//}

val httpClient = HttpClient{
    install(ContentNegotiation){
        json(
            Json{ //json config
                prettyPrint = true
                ignoreUnknownKeys = true
            }
        )
    }
}