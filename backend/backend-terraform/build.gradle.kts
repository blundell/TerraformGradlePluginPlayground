plugins {
    id("org.jetbrains.gradle.terraform") version "1.4.1"
}

terraform {
    version = "1.0.4"

    sourceSets {
        main {
            // apply and destroy are dangerous! put some checks on who can execute them!
            executeApplyOnlyIf { System.getenv("ENABLE_TF_APPLY") == "true" }
            executeDestroyOnlyIf { System.getenv("ENABLE_TF_DESTROY") == "true" }
        }
    }
}

dependencies {
    lambda(project(":lambdas:example-lambda"))
}