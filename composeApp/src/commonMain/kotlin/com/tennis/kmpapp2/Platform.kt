package com.tennis.kmpapp2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform