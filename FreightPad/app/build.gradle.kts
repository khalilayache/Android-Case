plugins {
  id("com.android.application")
  id("kotlin-android")
  id("kotlin-android-extensions")
  id("kotlin-kapt")
}

android {
  compileSdkVersion(AppVersion.compileVersion)
  buildToolsVersion(AppVersion.buildVersion)

  defaultConfig {
    applicationId = "dev.khalil.freightpad"
    minSdkVersion(AppVersion.minVersion)
    targetSdkVersion(AppVersion.targetVersion)
    versionCode = 1
    versionName = "1.0"

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  buildTypes {
    getByName("release") {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }

    getByName("debug") {
      isMinifyEnabled = false
      buildConfigField("String", "SEARCH_API_BASE_URL", "\"https://api.recalculafrete.com.br/\"")
      buildConfigField("String", "GEO_API_BASE_URL", "\"https://geo.api.truckpad.io/v1/\"")
      buildConfigField("String", "TICTAC_API_BASE_URL", "\"https://tictac.api.truckpad.io/v1/\"")
    }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }
  kotlinOptions {
    jvmTarget = "1.8"
  }
  buildFeatures {
    dataBinding = true
  }
  packagingOptions {
    exclude("META-INF/NOTICE")
    exclude("META-INF/LICENSE")
    exclude("META-INF/NOTICE.txt")
    exclude("META-INF/LICENSE.txt")
    exclude("META-INF/rxjava.properties")
  }
}

dependencies {
  //Kotlin
  implementation("org.jetbrains.kotlin:kotlin-stdlib:${DependenciesVersion.kotlinVersion}")

  //AndroidX
  implementation("androidx.core:core-ktx:${DependenciesVersion.coreKtxVersion}")
  implementation("androidx.appcompat:appcompat:${DependenciesVersion.appCompatVersion}")
  implementation("androidx.constraintlayout:constraintlayout:${DependenciesVersion.constraintLayoutVersion}")

  //Lifecycle
  implementation("androidx.lifecycle:lifecycle-extensions:${DependenciesVersion.lifecycleVersion}")

  //Material Components
  implementation("com.google.android.material:material:${DependenciesVersion.materialVersion}")

  //Maps
  implementation("com.google.android.gms:play-services-location:${DependenciesVersion.googleMapsVersion}")
  implementation("com.google.android.gms:play-services-maps:${DependenciesVersion.googleMapsVersion}")

  //Rx
  implementation("io.reactivex.rxjava2:rxjava:${DependenciesVersion.rxjavaVersion}")
  implementation("io.reactivex.rxjava2:rxandroid:${DependenciesVersion.rxandroidVersion}")
  implementation("io.reactivex.rxjava2:rxkotlin:${DependenciesVersion.rxkotlinVersion}")

  //Retrofit
  implementation("com.squareup.retrofit2:retrofit:${DependenciesVersion.retrofitVersion}")
  implementation("com.squareup.retrofit2:converter-gson:${DependenciesVersion.retrofitVersion}")
  implementation("com.squareup.retrofit2:adapter-rxjava2:${DependenciesVersion.retrofitVersion}")

  //Kodein
  implementation("org.kodein.di:kodein-di-generic-jvm:${DependenciesVersion.kodeinVersion}")
  implementation("org.kodein.di:kodein-di-framework-android-x:${DependenciesVersion.kodeinVersion}")

  //Gson
  implementation("com.google.code.gson:gson:${DependenciesVersion.gsonVersion}")

  //Lottie
  implementation("com.airbnb.android:lottie:${DependenciesVersion.lottieVersion}")

  //Test
  testImplementation("junit:junit:${DependenciesVersion.junitVersion}")
  androidTestImplementation("androidx.test.ext:junit:${DependenciesVersion.junitAndroidXVersion}")
}