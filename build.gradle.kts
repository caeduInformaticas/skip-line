plugins {
    kotlin("multiplatform") version "1.9.10"
    id("com.android.library") version "8.1.1"
    id("org.jetbrains.kotlin.native.cocoapods") version "1.9.10" // CocoaPods support
}

kotlin {
    androidTarget()

    // iOS targets
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    cocoapods {
        summary = "Shared module for KMP project"
        homepage = "https://example.com"
        version = "1.0.0"
        ios.deploymentTarget = "13.0"
        podfile = project.file("iosApp/Podfile")
        framework {
            baseName = "shared"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib"))
            }
        }

        val androidMain by getting {
            dependencies {
                implementation("androidx.core:core-ktx:1.10.1")
            }
        }

        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting

        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
        }
    }
}

android {
    namespace = "com.example.skipline"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
        targetSdk = 34
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "17"
    }
}

repositories {
    google()
    mavenCentral()
}
