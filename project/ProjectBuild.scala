import sbt._
import Keys._

object MongoScalaBuild extends Build {
  import Dependencies._
  import Resolvers._

  val buildSettings = Project.defaultSettings ++ Seq(
    version                := "0.1-SNAPSHOT",
    scalaVersion           := "2.10.2",
    libraryDependencies   ++= coreDependencies ++ testDependencies,
    resolvers             ++= projectResolvers,
    scalacOptions         ++= Seq("-unchecked", "-deprecation", "-feature" /*, "-Xlog-implicits", "-Yinfer-debug", "-Xprint:typer", "-Yinfer-debug", "-Xlog-implicits", "-Xprint:typer"*/ ),
    scalacOptions in (Compile, doc) ++= Seq("-diagrams", "-implicits"),
    scalacOptions in Test ++= Seq("-Yrangepos"),
    testFrameworks         += TestFrameworks.Specs2
  )

  lazy val myProject = Project(
    id           = "MyProject",
    base         = file("."),
    settings     = buildSettings
  )

}
