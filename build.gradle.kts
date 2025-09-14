group = "io.jpower.kcp"
version = "1.6.0"

plugins {
    java
}

allprojects {
    group = rootProject.group
    version = rootProject.version

    apply {
        plugin("java")
    }

    repositories {
        mavenCentral()
    }

    java {
        toolchain.languageVersion.set(JavaLanguageVersion.of(8))
    }

    tasks.withType<JavaCompile> {
        sourceCompatibility = "1.8"
        targetCompatibility = "1.8"

        options.encoding = "UTF-8"
    }
}

