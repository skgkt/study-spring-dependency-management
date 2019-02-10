plugins {
    java
    idea
    id("io.spring.dependency-management") version "1.0.6.RELEASE"
}

repositories {
    mavenCentral()
}

dependencyManagement {
    imports {
        val springBootVersion = "2.1.2.RELEASE"
        mavenBom("org.springframework.boot:spring-boot-dependencies:$springBootVersion")
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
}

tasks.wrapper {
    gradleVersion = "5.2.1"
    distributionType = Wrapper.DistributionType.BIN
}
