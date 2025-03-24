# skip-line — Kotlin Multiplatform Project (KMP)

Este proyecto está configurado para ejecutar una aplicación compartida entre Android e iOS usando Kotlin Multiplatform.

---

## 🚀 Requisitos

- **JDK 17**
- **Gradle 8.4**
- **Kotlin 1.9.10**
- **CocoaPods** (versión recomendada: 1.12.1 o superior)
- **Xcode 16+**
- **Android Studio**
- **Dispositivo físico Android/iOS o simulador/emulador**

---

## 📦 Estructura del Proyecto

```plaintext
skip-line/
├── androidApp/       → Aplicación Android
├── iosApp/           → Aplicación iOS
├── shared/           → Código común (multiplataforma)
├── build.gradle.kts  → Configuración general
├── settings.gradle.kts
└── gradle.properties


# .sdkmanrc (ejemplo)
java=17.0.8-amzn
gradle=8.4

Sincroniza los SDKs declarados:
sdk env install

Compilar la app Android:
./gradlew assembleDebug

Generar APK manualmente:
./gradlew androidApp:assembleDebug



IOS
Si usas una versión antigua y quieres tener dos versiones:
sudo gem install cocoapods -v 1.12.1
# Usar bundle para gestionar versiones locales
bundle init
bundle add cocoapods -v 1.12.1
bundle install




bundle exec pod install
# o si no usas bundle:
pod install



open iosApp.xcworkspace
