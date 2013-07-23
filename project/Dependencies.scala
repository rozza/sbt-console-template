import sbt._

object Dependencies {
  // Versions
  val specs2Version        = "2.1.1"

  // // Libraries
  val specs2        = "org.specs2" %% "specs2" % specs2Version

  val reflection    = "org.scala-lang" % "scala-reflect" % "2.10.2"
  val compiler      = "org.scala-lang" % "scala-compiler" % "2.10.2"

  // Projects
  val coreDependencies = Seq(reflection, compiler)
  val testDependencies = Seq(specs2 % "test")
}
