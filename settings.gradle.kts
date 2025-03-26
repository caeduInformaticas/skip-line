pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        kotlin("multiplatform") version "1.9.10"
        id("com.android.library") version "8.1.1"
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "skip-line"
include(":androidApp")
include(":iosApp")
include(":shared") // Asegúrate de que este módulo esté incluido
