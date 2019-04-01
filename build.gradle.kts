import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm") version "1.3.21"
}

group = "codes.som.anthony"
version = "1.0.0"

repositories {
    mavenCentral()
}

for (sourceSetId in arrayOf(
    "fizzbuzz_basic"
)) {
    project.sourceSets.create(sourceSetId) {
        val sourceSet = this
        tasks.create<Jar>(sourceSetId) {
            archiveName = "$sourceSetId.jar"
            from(sourceSet.output)
        }
    }
}

dependencies {
    implementation("org.codehaus.groovy:groovy-all:2.3.11")
    implementation(kotlin("stdlib-jdk8"))

    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
