ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.6"

lazy val root = (project in file("."))
  .settings(
    name := "SimpleJob"
  )

name := "Simple Project"

version := "1.0"

scalaVersion := "2.13.16"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "4.0.0"
