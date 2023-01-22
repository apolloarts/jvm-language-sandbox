repositories {
    mavenCentral()
}

plugins {
    `java-library`
    idea
    scala
    kotlin("jvm") version "1.7.20"
}

dependencies {
    implementation("org.scala-lang:scala-library:2.12.17")
    testImplementation("org.scalatest:scalatest_2.12:3.0.2")
    testImplementation("junit:junit:4.13")
}

configurations {
    implementation {
        resolutionStrategy.failOnVersionConflict()
    }
}

sourceSets {
    main {
        java.srcDir("src/main/core")
        resources.srcDirs("src/main/resources")
    }
    test{
        java.srcDirs("src/test/core")
        resources.srcDirs("src/test/resources")
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

tasks {
    test {
        testLogging.showExceptions = true
    }
}