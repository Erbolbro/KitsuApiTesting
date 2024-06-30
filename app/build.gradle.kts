plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    //hilt
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
    // safe args
    id("androidx.navigation.safeargs")
}

android {
    namespace = "com.example.kitsuapitesting"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.kitsuapitesting"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
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
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.androidx.mediarouter)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")

    //Retrofit_2
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    //OkHttp
    implementation(platform("com.squareup.okhttp3:okhttp-bom:4.12.0"))
    // define any required OkHttp artifacts without version
    implementation("com.squareup.okhttp3:okhttp")
    implementation("com.squareup.okhttp3:logging-interceptor")

    // Glide
    implementation("com.github.bumptech.glide:glide:4.16.0")

    // Hilt
    implementation("com.google.dagger:hilt-android:2.51")
    kapt("com.google.dagger:hilt-android-compiler:2.51")
    implementation ("org.jetbrains:annotations:RELEASE_VERSION")

    // Paging
    val paging_version = "3.2.1"
    implementation("androidx.paging:paging-runtime:$paging_version")
    //coroutines
    implementation ("org.jetbrains.kotlin:kotlin-stdlib")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.2")

    //async
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    //viewBinding
    val view_binding_property_dalagete = "1.5.9"
    implementation ("com.github.kirich1409:viewbindingpropertydelegate-noreflection:$view_binding_property_dalagete")
}