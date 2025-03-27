#!/bin/bash

echo "🔄  Generando podspec del módulo shared..."
./gradlew :shared:podspec || { echo "❌ Falló la generación del podspec"; exit 1; }

echo "📦  Ejecutando pod install en iosApp..."
cd iosApp || { echo "❌ No se encontró la carpeta iosApp"; exit 1; }
bundle exec pod install || { echo "❌ Falló pod install"; exit 1; }

echo "✅  Módulo shared actualizado correctamente en iOS 🎉"
