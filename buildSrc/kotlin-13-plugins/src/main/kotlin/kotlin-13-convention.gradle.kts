import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

// Mix-in for Kotlin 1.3 projects.

plugins {
	kotlin("jvm")
}

dependencies {
	implementation(kotlin("reflect"))
	implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.8")
}

java {
	sourceCompatibility = JavaVersion.VERSION_11
	targetCompatibility = JavaVersion.VERSION_11
}

tasks {
	withType<KotlinCompile> {
		with(kotlinOptions) {
			languageVersion = "1.3"
			apiVersion = "1.3"
			jvmTarget = JavaVersion.VERSION_11.toString()
		}
	}
}
