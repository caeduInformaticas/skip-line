plugins {
    kotlin("multiplatform") version "1.9.10"
    id("com.android.library")
}

kotlin {
    androidTarget()
    iosX64()
    iosArm64()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib"))
            }
        }
        val androidMain by getting
        val iosMain by getting
    }
}

android {
    namespace = "com.example.skipline"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
        targetSdk = 34
    }
}
