import org.gradle.api.tasks.wrapper.Wrapper.DistributionType.ALL

allprojects {
	group = "org.sdkotlin"
	version = "1.0-SNAPSHOT"

	repositories {
		mavenCentral()
		jcenter()
	}
}

tasks {
	named<Wrapper>("wrapper") {
		gradleVersion = "6.7.1"
		distributionType = ALL
	}
}
