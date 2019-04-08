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

for ((sourceSetId, main) in mapOf(
    "fizzbuzz_basic" to "codes.som.anthony.oof4j.fizzbuzz.basic.BasicFizzBuzz",
    "hello_world" to "codes.som.anthony.oof4j.helloworld.HelloWorld", 
    "anonymous_lambda" to "codes.som.anthony.oof4j.anonymouslambda.AnonymousLambda",
    "fizzbuzz_enterprise" to "codes.som.anthony.oof4j.fizzbuzz.enterprise.EnterpriseFizzBuzzCommandLineEntryPoint",
    "enum_constants" to "codes.som.anthony.oof4j.enumconstants.EnumConstants",
    "interface_overlap" to "codes.som.anthony.oof4j.interfaceoverlap.InterfaceOverlap"
)) {
    project.sourceSets.create(sourceSetId) {
        val sourceSet = this
        tasks.register<Jar>(sourceSetId) {
            archiveName = "$sourceSetId.jar"
            manifest {
                attributes(mapOf(
                    "Main-Class" to main
                ))
            }

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
