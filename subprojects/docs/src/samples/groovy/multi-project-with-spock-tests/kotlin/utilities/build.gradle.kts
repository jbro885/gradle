plugins {
    groovy
}

dependencies {
    implementation("org.codehaus.groovy:groovy-all:3.0.5")
    testImplementation("org.spockframework:spock-core:2.0-M3-groovy-3.0")
    implementation(project(":list"))
}
