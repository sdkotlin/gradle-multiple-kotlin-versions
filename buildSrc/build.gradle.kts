plugins {
	`kotlin-dsl`
}

allprojects {
	repositories {
		mavenCentral()
		jcenter()
	}
}

dependencies {
	// Match the Kotlin version embedded in the current Gradle version.
	implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.72")
}

kotlinDslPluginOptions {
	experimentalWarning.set(false)
}
