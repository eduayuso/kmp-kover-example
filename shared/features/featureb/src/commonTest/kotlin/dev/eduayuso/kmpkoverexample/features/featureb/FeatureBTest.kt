package dev.eduayuso.kmpkoverexample.features.featureb

import dev.eduayuso.kmpkoverexample.shared.features.featureb.FeatureB
import kotlin.test.Test
import kotlin.test.assertTrue

class FeatureBTest {

    @Test
    fun testExample() {

        assertTrue(FeatureB.presentData().contains("entity"))
    }
}