import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm") version "1.4.0"
    kotlin("plugin.serialization") version "1.4.0"
    application
    id("org.openjfx.javafxplugin") version "0.0.9"
}
group = "io.github.nico-kun1316"
version = "1.0-SNAPSHOT"

javafx {
    version = "11"
    modules("javafx.controls", "javafx.graphics", "javafx.fxml")
}
repositories {
    jcenter()
    mavenCentral()
}
dependencies {
    testImplementation(kotlin("test-junit5"))
}
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}
application {
    mainClassName = "App"
}
