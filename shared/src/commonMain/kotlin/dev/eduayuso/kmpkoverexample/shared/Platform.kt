package dev.eduayuso.kmpkoverexample.shared

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform