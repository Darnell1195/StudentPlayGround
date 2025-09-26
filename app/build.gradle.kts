plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.studentplayground"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.studentplayground"
        minSdk = 24
        targetSdk = 36
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


    // JUnit para pruebas unitarias
    testImplementation(libs.junit)
    // MockK para mocks
    testImplementation("io.mockk:mockk:1.14.5")
    // Mockito para mocks (puedes usar ambos si lo necesitas)
    testImplementation("org.mockito:mockito-core:5.2.0")
    // Corrutinas (versión más reciente)
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.10.2")
    // AssertJ (versión más reciente)
    testImplementation("org.assertj:assertj-core:3.27.6")


}