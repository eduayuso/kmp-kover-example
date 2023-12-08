package dev.eduayuso.kmpkoverexample.shared.features.featureb

import dev.eduayuso.kmpkoverexample.shared.domain.EntityExample

object FeatureB {

    private val entity = EntityExample("I'm an entity presented by FeatureB")

    fun presentData() = entity.data
}