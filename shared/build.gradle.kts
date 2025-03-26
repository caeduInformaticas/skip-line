plugins {
    kotlin("multiplatform")
    id("org.jetbrains.kotlin.native.cocoapods")
}

kotlin {
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    cocoapods {
        summary = "Shared module for KMP project"
        homepage = "https://example.com"
        version = "1.0.0"
        ios.deploymentTarget = "13.0"
        framework {
            baseName = "shared"
        }
    }

    sourceSets {
        val commonMain by getting
        val iosMain by creating {
            dependsOn(commonMain)
        }
    }
}
