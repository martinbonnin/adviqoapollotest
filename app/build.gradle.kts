apply(plugin = "com.android.application")
apply(plugin = "kotlin-android")
apply(plugin = "kotlin-android-extensions")
apply(plugin = "com.apollographql.apollo")

configure<com.android.build.gradle.BaseExtension> {
    compileSdkVersion(29)
    defaultConfig {
        applicationId = "com.example.adviqoapollotest"
        minSdkVersion(21)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

tasks.withType(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class.java) {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}
dependencies {
    add("implementation", "org.jetbrains.kotlin:kotlin-stdlib:1.3.72")
    add("implementation", "androidx.core:core-ktx:1.2.0")
    add("implementation", "androidx.appcompat:appcompat:1.1.0")
    add("implementation", "androidx.constraintlayout:constraintlayout:1.1.3")
    add("testImplementation", "junit:junit:4.13")
    add("androidTestImplementation", "androidx.tschema.jsonest.ext:junit:1.1.1")
    add("androidTestImplementation", "androidx.test.espresso:espresso-core:3.2.0")

    add("implementation", "com.apollographql.apollo:apollo-runtime:2.0.3")
}

configure<com.apollographql.apollo.gradle.api.ApolloExtension> {
    generateKotlinModels.set(true) // or false for Java models
}
