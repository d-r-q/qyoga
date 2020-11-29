plugins {
    kotlin("jvm")
    application
}

val ktor_version: String by System.getProperties()


repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("no.tornado:tornadofx:1.7.20")

    implementation(project(":qyoga-api"))

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-javafx:1.4.2")

    implementation("io.ktor:ktor-client-core:$ktor_version")
    implementation("io.ktor:ktor-client-cio:$ktor_version")
    implementation("io.ktor:ktor-client-jackson:$ktor_version")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.10.2")

}

application {
    mainClass.value("QyogaTfxApp")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}