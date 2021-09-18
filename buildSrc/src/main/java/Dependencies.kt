object Apps {
    const val applicationID ="com.solo4.belmova"
    const val compileSdk = 31
    const val minSdk = 25
    const val targetSdk = 31
    const val versionCode = 1
    const val versionName = "0.0.1"
}

object Versions {
    const val gradle = "4.1.0"
    const val kotlin = "1.5.30"
    const val appcompat = "1.3.1"
    const val coreKtx = "1.6.0"
    const val constraintLayout = "2.1.0"

    const val navComponent = "2.3.5"
    const val hilt = "2.38.1"
    const val hiltSnapShot = "1.0.0"
    const val hiltSnapShotViewModel = "1.0.0-alpha03"
    const val okHttp = "4.9.1"
    const val retrofit = "2.9.0"
    const val gson = "2.8.8"

    const val lottie = "3.2.1"
    const val mdc = "1.4.0"
}

object Libs {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

    // Hilt
    const val hiltCore = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltDaggerAndroidCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    const val hiltCommon = "androidx.hilt:hilt-common:${Versions.hiltSnapShot}"
    const val hiltViewModelLifecycle = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltSnapShotViewModel}"
    const val hiltCompiler = "androidx.hilt:hilt-compiler:${Versions.hiltSnapShot}"

    // Navigation component
    const val navComponentFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navComponent}"
    const val navComponentUi = "androidx.navigation:navigation-ui-ktx:${Versions.navComponent}"

    // OkHttp
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    const val okHttpLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"

    // Retrofit
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"

    // Gson
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
    const val gsonConverter = "com.squareup.retrofit2:converter-gson:2.8.1"

    //Lottie
    const val lottie = "com.airbnb.android:lottie:${Versions.lottie}"

    //MDC
    const val MDC = "com.google.android.material:material:${Versions.mdc}"
}

object Modules {
    const val central = ":central"
}