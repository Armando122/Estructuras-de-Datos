import Dependencies._

ThisBuild / scalaVersion     := "2.13.4"
ThisBuild / version          := "1.0"
ThisBuild / organization     := "com.proyectos"
ThisBuild / organizationName := "proyectos"

lazy val root = (project in file("."))
  .settings(
    name := "listas",
    libraryDependencies += scalaTest % Test
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
