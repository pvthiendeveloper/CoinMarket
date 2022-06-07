plugins {
    id(BuildPlugins.ANDROID_APPLICATION_PLUGIN) version BuildPlugins.Version.ANDROID_APPLICATION_PLUGIN apply false
    id(BuildPlugins.ANDROID_LIBRARY_PLUGIN) version BuildPlugins.Version.ANDROID_LIBRARY_PLUGIN apply false
    id(BuildPlugins.JETBRAINS_KOTLIN_ANDROID) version BuildPlugins.Version.JETBRAINS_KOTLIN_ANDROID apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}