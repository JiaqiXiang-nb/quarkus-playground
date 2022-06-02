pluginManagement {
    val quarkusPluginVersion: String by settings
    val quarkusPluginId: String by settings
    repositories {
        maven(url="https://maven.aliyun.com/repository/public/")
        maven(url="https://maven.aliyun.com/repository/google/")
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        id(quarkusPluginId) version quarkusPluginVersion
    }
}
rootProject.name="quarkus-playground"
