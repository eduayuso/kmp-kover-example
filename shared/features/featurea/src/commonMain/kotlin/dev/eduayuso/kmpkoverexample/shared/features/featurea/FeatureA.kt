package dev.eduayuso.kmpkoverexample.shared.features.featurea

interface FeatureA {

    val value: String
}

expect fun getFeatureA(): FeatureA