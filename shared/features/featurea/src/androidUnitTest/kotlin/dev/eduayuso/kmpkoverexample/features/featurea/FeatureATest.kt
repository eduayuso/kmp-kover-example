package dev.eduayuso.kmpkoverexample.features.featurea

import dev.eduayuso.kmpkoverexample.shared.features.featurea.getFeatureA
import kotlin.test.Test
import kotlin.test.assertTrue

class FeatureATest {

    @Test
    fun testExample() {

        assertTrue(getFeatureA().value.contains("Android"))
    }
}