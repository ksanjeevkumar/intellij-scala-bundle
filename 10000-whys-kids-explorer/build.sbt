name := "10000-whys-kids-explorer"
organization := "org.whysexplorer"
version := "0.1.0-SNAPSHOT"
scalaVersion := "2.13.12"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-collection-compat" % "2.11.0",
  "io.circe"               %% "circe-core"              % "0.14.6",
  "io.circe"               %% "circe-generic"           % "0.14.6",
  "io.circe"               %% "circe-parser"            % "0.14.6",
  "org.scalatest"          %% "scalatest"               % "3.2.17" % Test
)

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-Xfatal-warnings",
  "-Ywarn-unused:imports"
)
