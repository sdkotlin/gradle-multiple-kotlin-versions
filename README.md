# Gradle Multiple Kotlin Versions Sample

An attempt to use Kotlin DSL-based
[precompiled script plugins](https://docs.gradle.org/current/userguide/custom_plugins.html#sec:precompiled_plugins)
that don't
[conflict with Gradle's embedded Kotlin version](https://youtrack.jetbrains.com/issue/KT-38010)
to mix different versions of Kotlin into subprojects of a multi-project build.
