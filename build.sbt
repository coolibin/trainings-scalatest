
lazy val org = "coolibin"
lazy val appVersion = "0.0.0"
ThisBuild / scalaVersion := "2.13.12"


lazy val commonSettings = Seq(
  organization := org,
  version := appVersion,
  scalacOptions ++= Seq(
    "-feature",
    "-unchecked",
    "-language:postfixOps",
    "-deprecation:false",
    "-explaintypes",
    "-language:implicitConversions",
    "-language:existentials"
  )
)

lazy val `module-1` = project
  .settings(commonSettings)
  .settings(
    name := "module-1",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % Versions.scalaTest
    )
  )
