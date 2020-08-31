// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
  repositories {
    google()
    jcenter()
  }
  dependencies {
    classpath("com.android.tools.build:gradle:${DependenciesVersion.gradleVersion}")
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${DependenciesVersion.kotlinVersion}")
  }
}

allprojects {
  repositories {
    google()
    jcenter()
  }
}

tasks.register("clean", Delete::class) {
  delete(rootProject.buildDir)
}