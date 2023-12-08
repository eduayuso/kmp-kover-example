plugins {
    id(BuildConstants.Conventions.androidLibrary)
    id(libs.plugins.kotlin.kover.get().pluginId)
}

android {
    namespace = BuildConstants.NameSpaces.Android.featureB
}

dependencies {

    implementation(project(BuildConstants.Modules.Shared.featureB))

    libs {
        listOf(
            ui,
            ui.tooling,
            ui.tooling.preview,
            foundation,
            material,
        ).forEach { dep ->
            implementation(dep)
        }
    }
}