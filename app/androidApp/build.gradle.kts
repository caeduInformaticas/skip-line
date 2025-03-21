plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.example.androidApp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.androidApp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation(project(":")) // ← esto importa el módulo KMP raíz
}
