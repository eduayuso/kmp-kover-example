plugins {
    id(BuildConstants.Conventions.multiplatformModule)
    id(libs.plugins.kotlin.kover.get().pluginId)
}

android {
    namespace = BuildConstants.NameSpaces.Shared.featureB
}

kotlin {

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "featureb"
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation(project(BuildConstants.Modules.Shared.domain))
            }
        }
    }
}