Pod::Spec.new do |spec|
    spec.name                     = 'shared'
    spec.version                  = '1.0'
    spec.summary                  = 'Some description for the Shared Module'
    spec.homepage                 = 'https://github.com/.../shared'
    spec.license                  = { :type => 'MIT', :file => 'LICENSE' }
    spec.authors                  = { 'author' => 'author@example.com' }
    spec.source                   = { :git => 'https://github.com/.../shared.git', :tag => '1.0' }
  
    # Ruta actualizada al XCFramework
    spec.vendored_frameworks     = 'build/XCFrameworks/release/shared.xcframework'
  
    spec.platform     = :ios, '13.0'
  end
  