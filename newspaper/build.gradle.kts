tasks.register("runArticle") {
	group = "custom"
	description = "Ejecuta solo MicroArticle"
	doLast {
		exec {
			workingDir = file("MicroArticle")
			commandLine(rootProject.file("gradlew.bat").absolutePath, "bootRun")
		}
	}
}

tasks.register("runReader") {
	group = "custom"
	description = "Ejecuta solo MicroReader"
	doLast {
		exec {
			workingDir = file("MicroReader")
			commandLine(rootProject.file("gradlew.bat").absolutePath, "bootRun")
		}
	}
}

tasks.register("runWorker") {
	group = "custom"
	description = "Ejecuta solo MicroWorker"
	doLast {
		exec {
			workingDir = file("MicroWorker")
			commandLine(rootProject.file("gradlew.bat").absolutePath, "bootRun")
		}
	}
}







