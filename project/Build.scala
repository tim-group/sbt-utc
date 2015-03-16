import sbt._
import Keys._
object SbtUtcBuild extends Build with BuildExtra {

  lazy val lib_jodatime = Seq(
    "joda-time" % "joda-time"    % "2.3"   % "optional",
    "org.joda"  % "joda-convert" % "1.3.1" % "optional"
  )

  val sbtUtc = Project("sbt-utc", file("."))
    .settings(
      sbtPlugin    := true,
      organization := "com.timgroup",
      name         := "sbt-utc",
      version      := "0.0." + System.getProperty("BUILD_NUMBER", "0-SNAPSHOT"),
      sbtVersion   in Global := "0.13.7",
      scalaVersion in Global := "2.10.4",
      libraryDependencies ++= lib_jodatime
    )
    .settings(
      publishTo := Some("TIM Group Repo" at "http://repo.youdevise.com:8081/nexus/content/repositories/yd-release-candidates")
    )
    .settings(credentials += Credentials(new File("/etc/sbt/credentials")))
}
