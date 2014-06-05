import sbt._
import Keys._

object SbtUtcBuild extends Build with BuildExtra {
  lazy val lib_jodatime = Seq(
    "joda-time" % "joda-time" % "2.3" % "optional",
    "org.joda" % "joda-convert" % "1.3.1" % "optional"
  )
  val sbtUtc = Project("sbt-utc", file("."))
    .settings(sbtPlugin := true,
      organization := "com.timgroup",
      name := "sbt-utc",
      version := "0.0.1",
      sbtVersion in Global := "0.13.0",
      scalaVersion in Global := "2.10.2",
      libraryDependencies ++= lib_jodatime
    )
}
