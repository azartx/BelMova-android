import android.annotation.SuppressLint

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("kotlin-android")
    id("androidx.navigation.safeargs")
    id("dagger.hilt.android.plugin")
}

apply { plugin("kotlin-android") }

android {
    compileSdk = Apps.compileSdk
    defaultConfig {
        applicationId =  Apps.applicationID
        minSdk = Apps.minSdk
        targetSdk = Apps.targetSdk
        versionCode = Apps.versionCode
        versionName = Apps.versionName
        multiDexEnabled = true
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
    }
    buildFeatures {
        @SuppressLint("DataBindingWithoutKapt")
        dataBinding = true
        viewBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
    sourceSets {
        getByName("main").java.srcDirs("build/generated/source/navigation-args")
    }
    lintOptions.isAbortOnError = false
    lintOptions.isCheckReleaseBuilds = false
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Libs.kotlin)
    implementation(Libs.appcompat)
    implementation(Libs.coreKtx)
    implementation(Libs.constraintLayout)

    // Hilt
    implementation(Libs.hiltCore)
    implementation(Libs.hiltCommon)
    implementation(Libs.hiltViewModelLifecycle)
    kapt(Libs.hiltDaggerAndroidCompiler)
    kapt(Libs.hiltCompiler)

    // Navigation
    implementation(Libs.navComponentFragment)
    implementation(Libs.navComponentUi)

    // Okhttp
    implementation(Libs.okHttp)
    implementation(Libs.okHttpLogging)

    // Retrofit
    implementation(Libs.retrofit)

    // Gson
    implementation(Libs.gson)
    implementation(Libs.gsonConverter)

    //MDC
    implementation(Libs.MDC)
}
repositories {
    maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }
    mavenCentral()
}
