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

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation(project(":")) // Usa el módulo raíz multiplataforma
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.core:core-ktx:1.10.1")
}

// ✅ Asegura jvmTarget correcto para compilaciones Kotlin en este módulo
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "17"
    }
}
