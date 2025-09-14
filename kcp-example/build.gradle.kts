dependencies {
    implementation(project(":kcp-netty"))

    implementation(libs.io.netty.netty.transport)
    implementation(libs.io.netty.netty.codec)
    implementation(libs.org.slf4j.slf4j.api)
    implementation(libs.org.slf4j.slf4j.simple)
}