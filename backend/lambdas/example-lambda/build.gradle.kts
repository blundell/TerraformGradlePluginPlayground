plugins {
    id("com.github.johnrengelman.shadow") version "7.1.2"
    id("org.jetbrains.kotlin.jvm")
}

dependencies {
    implementation("com.amazonaws:aws-lambda-java-core:1.2.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.6.10")
}

tasks {
    shadowJar {
        archiveFileName.set("myExample.jar")
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "11"
        suppressWarnings = true
    }
}
