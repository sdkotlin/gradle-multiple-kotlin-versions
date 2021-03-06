import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

// Mix-in for Kotlin 1.4 projects.

plugins {
	kotlin("jvm")
}

dependencies {
	implementation(kotlin("reflect"))
	implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.2")
}

java {
	sourceCompatibility = JavaVersion.VERSION_11
	targetCompatibility = JavaVersion.VERSION_11
}

tasks {
	withType<KotlinCompile> {
		with(kotlinOptions) {
			languageVersion = "1.4"
			apiVersion = "1.4"
			jvmTarget = JavaVersion.VERSION_11.toString()
		}
	}
}
