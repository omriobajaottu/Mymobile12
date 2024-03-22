plugins {
    id("com.android.application") // Mengganti `alias(libs.plugins.androidApplication)` dengan `id("com.android.application")`
    id("kotlin-android") // Mengganti `alias(libs.plugins.jetbrainsKotlinAndroid)` dengan `id("kotlin-android")`
}

android {
    compileSdkVersion(34) // Mengubah `compileSdk` menjadi `compileSdkVersion` dan menggunakan fungsi `compileSdkVersion()`
    defaultConfig {
        applicationId = "com.example.mymobile"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
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
}

dependencies {
    implementation("androidx.core:core-ktx:1.7.0") // Mengubah `libs.androidx.core.ktx` menjadi `"androidx.core:core-ktx:1.7.0"`
    implementation("androidx.recyclerview:recyclerview:1.3.0")
    implementation("androidx.appcompat:appcompat:1.4.0") // Mengubah `libs.androidx.appcompat` menjadi `"androidx.appcompat:appcompat:1.4.0"`
    implementation("com.google.android.material:material:1.5.0") // Mengubah `libs.material` menjadi `"com.google.android.material:material:1.5.0"`
    implementation("androidx.activity:activity:1.4.0") // Mengubah `libs.androidx.activity` menjadi `"androidx.activity:activity:1.4.0"`
    implementation("androidx.constraintlayout:constraintlayout:2.1.3") // Mengubah `libs.androidx.constraintlayout` menjadi `"androidx.constraintlayout:constraintlayout:2.1.3"`
    testImplementation("junit:junit:4.13.2") // Mengubah `libs.junit` menjadi `"junit:junit:4.13.2"`
    androidTestImplementation("androidx.test.ext:junit:1.1.3") // Mengubah `libs.androidx.junit` menjadi `"androidx.test.ext:junit:1.1.3"`
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0") // Mengubah `libs.androidx.espresso.core` menjadi `"androidx.test.espresso:espresso-core:3.4.0"`
    implementation("de.hdodenhof:circleimageview:3.0.0")
}


