plugins {
    id(BuildPlugins.ANDROID_LIBRARY_PLUGIN)
    id(BuildPlugins.KOTLIN_ANDROID_PLUGIN)
}

android {
    compileSdk = ProjectProperties.COMPILE_SDK

    defaultConfig {
        minSdk = ProjectProperties.MIN_SDK
        targetSdk = ProjectProperties.TARGET_SDK
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Lib.Android.COMPOSE_COMPILER_VERSION
    }
}

dependencies {
    implementation(project(":core:ui"))
    implementation(project(":core:navigation"))

    implementation(Lib.Kotlin.KTX_CORE)
    implementation(Lib.Kotlin.KT_STD)

    implementation(Lib.Android.APP_COMPAT)
    implementation(Lib.Android.MATERIAL_DESIGN)
    implementation(Lib.Android.COMPOSE_MATERIAL)
    implementation(Lib.Android.COMPOSE_TOOLING)
    implementation(Lib.Android.COMPOSE_DEBUG_TOOLING)
    implementation(Lib.Android.ACTIVITY_COMPOSE)
    implementation(Lib.Android.COMPOSE_NAVIGATION)

    implementation(TestLib.JUNIT)
    implementation(TestLib.ANDROID_JUNIT)
}