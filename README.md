# trainings-scalatest
Training materials for testing with ScalaTest

# module-1-01: Adding logger with basic configuration

- add dependency to  `"com.typesafe.scala-logging" %% "scala-logging" % Versions.scalaLogging`
- add dependency to `"ch.qos.logback" % "logback-classic" % Versions.logback`
- extend class with `LazyLogging`
- adjust logging settings by adding the `logback.xml` file to the `resources` folder
- in the future the configuration will be extended with additional features when required

