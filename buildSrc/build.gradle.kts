plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

gradlePlugin {
    plugins {
        create("runHytale") {
            id = "run-hytale"
            implementationClass = "RunHytalePlugin"
        }
    }
}

repositories {
    mavenCentral()
}
