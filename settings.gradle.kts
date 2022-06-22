pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "CoinMarket"
include(":app")
include(":core")
include(":core:navigation")
include(":features")
include(":features:onboarding")
include(":core:ui")
include(":features:dashboard")
include(":features:home")
include(":features:market")
include(":features:trade")
include(":features:activity")
include(":features:wallet")
