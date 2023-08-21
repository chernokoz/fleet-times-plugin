repositories {
    mavenCentral()
    maven("https://cache-redirector.jetbrains.com/intellij-dependencies")
}

plugins {
    kotlin("jvm") version "1.8.0"
    `kotlin-dsl`
    id("org.jetbrains.fleet-plugin") version "0.2.63"
}

version = "0.1.0"
dependencies {
    implementation("org.jetbrains:annotations:24.0.0")
}

fleet {
    fleetVersion.set("1.23.75")

    // presentation
    vendor.set("Aleksandr Chernokoz")
    readableName.set("Fleet Times Plugin")
    descriptor.set("A simple plugin adding an action to open the website of The Times newspaper.")

    workspace {
        // workspace dependencies
    }

    frontend {
        // frontend dependencies
    }

    common {
        // common dependencies
    }

    // required plugins
    // plugins.addAll("fleet.run")
}
