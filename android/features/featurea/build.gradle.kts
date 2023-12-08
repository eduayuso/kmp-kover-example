plugins {
    id(BuildConstants.Conventions.androidLibrary)
    id(libs.plugins.kotlin.kover.get().pluginId)
}

android {
    namespace = BuildConstants.NameSpaces.Android.featureA
}

dependencies {

    BuildConstants.Modules.Shared.featureA.let {
        implementation(project(it))
        kover(project(it))
    }
    implementation(project(BuildConstants.Modules.Shared.featureA))
    kover(project(BuildConstants.Modules.Shared.featureA))

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

koverReport {

    // filters for all report types of all build variants
    filters {
        excludes {
            classes(
                "*Fragment",
                "*Fragment\$*",
                "*Activity",
                "*Activity\$*",
                "*.databinding.*",
                "*.BuildConfig"
            )
        }
    }

    defaults {
        /**
         * Tests, sources, classes, and compilation tasks of the 'debug' build variant will be included in the default reports.
         * Thus, information from the 'debug' variant will be included in the default report for this project and any project that specifies this project as a dependency.
         *
         * Since the report already contains classes from the JVM target, they will be supplemented with classes from 'debug' build variant of Android target.
         */
        mergeWith("debug")
    }

    androidReports("release") {
        // filters for all report types only of 'release' build type
        filters {
            excludes {
                classes(
                    "*Fragment",
                    "*Fragment\$*",
                    "*Activity",
                    "*Activity\$*",
                    "*.databinding.*",
                    "*.BuildConfig",

                    // excludes debug classes
                    "*.DebugUtil"
                )
            }
        }
    }
}