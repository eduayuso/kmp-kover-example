
plugins {
    listOf(
        libs.plugins.android.application.get(),
        libs.plugins.android.library.get(),
        libs.plugins.kotlin.android.get(),
        libs.plugins.kotlin.multiplatform.get(),
        libs.plugins.org.jetbrains.kotlin.jvm.get()
    ).forEach {
        id(it.pluginId) apply false
    }
    listOf(
        libs.plugins.kotlin.kover.get()
    ).forEach {
        id(it.pluginId) version "${it.version}"
    }
}

dependencies {

    kover(project(":shared:features:featurea"))
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
