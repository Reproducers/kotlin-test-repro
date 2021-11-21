plugins {
    kotlin("jvm") version "1.6.0"
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
