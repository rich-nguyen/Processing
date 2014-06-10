import sbt._
import sbt.Keys._

object ProcessingApp extends Build {

  lazy val project = Project("processingApp", file("."))
    .settings(
      organization := "com.gu",
      scalaVersion := "2.10.4"
    )
}
