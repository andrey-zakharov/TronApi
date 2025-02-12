repositories {
    mavenCentral()
}
plugins {
    kotlin("jvm") version "1.9.24"
}
tasks.test {
    useJUnitPlatform()
}
dependencies {
    implementation("com.google.code.gson:gson:2.8.9")
    implementation("com.squareup.okhttp3:okhttp:4.10.0")
    implementation("cn.hutool:hutool-crypto:5.8.21")
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
}
