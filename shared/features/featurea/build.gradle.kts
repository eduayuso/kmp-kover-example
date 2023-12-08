plugins {
    id(BuildConstants.Conventions.multiplatformModule)
    id(libs.plugins.kotlin.kover.get().pluginId)
}

android {
    namespace = BuildConstants.NameSpaces.Shared.featureA
}

kotlin {

    jvmToolchain(8)
    androidTarget()
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "featurea"
        }
    }
}