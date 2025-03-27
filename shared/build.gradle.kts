plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.kotlin.native.cocoapods")
}

kotlin {
    androidTarget() // Usar androidTarget en lugar de android()

    iosX64()
    iosArm64()
    iosSimulatorArm64() // Asegurarse de incluir este target

    cocoapods {
        summary = "Shared module for KMP project"
        homepage = "https://github.com/your-repo/shared"
        version = "1.0.0"
        ios.deploymentTarget = "13.0"
        framework {
            baseName = "shared"
        }
    }

    sourceSets {
        val commonMain by getting
        val androidMain by getting

        val iosMain by creating {
            dependsOn(commonMain) // Conectar iosMain a commonMain
        }

        val iosX64Main by getting {
            dependsOn(iosMain) // Conectar iosX64Main a iosMain
        }
        val iosArm64Main by getting {
            dependsOn(iosMain) // Conectar iosArm64Main a iosMain
        }
        val iosSimulatorArm64Main by getting {
            dependsOn(iosMain) // Conectar iosSimulatorArm64Main a iosMain
        }
    }
}

android {
    namespace = "com.skipline.shared"
    compileSdk = 33
    defaultConfig {
        minSdk = 21
        targetSdk = 33 // Mantener targetSdk aquí, pero está en desuso
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17 // Configurar JVM 17
        targetCompatibility = JavaVersion.VERSION_17 // Configurar JVM 17
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17)) // Asegurar JVM 17
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "17" // Configurar JVM 17
    }
}

repositories {
    google()
    mavenCentral()
}
