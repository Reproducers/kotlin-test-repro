plugins {
    kotlin("multiplatform") version "1.6.0"
}

kotlin {
    jvm()

    sourceSets {
        commonTest {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-test")
            }
        }
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
