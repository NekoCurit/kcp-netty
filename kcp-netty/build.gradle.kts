plugins {
    `maven-publish`
}

dependencies {
    implementation(libs.io.netty.netty.transport)
    testImplementation(libs.junit.junit)
    testImplementation(libs.org.easymock.easymock)
}

publishing {
    publications {
        create<MavenPublication>(project.name) {
            artifactId = base.archivesName.get()
            from(components["java"])
        }
    }
}

java {
    withSourcesJar()
}