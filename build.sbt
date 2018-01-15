
val sbtUtc = Project("sbt-utc", file("."))
  .settings(
    sbtPlugin    := true,
    organization := "com.timgroup",
    name         := "sbt-utc",
    version      := "0.0." + System.getProperty("BUILD_NUMBER", "0-SNAPSHOT"),
    scalaVersion in ThisBuild := "2.12.4",
    crossSbtVersions := Vector("1.0.0", "0.13.16"),
    libraryDependencies ++= Seq(
      "joda-time" % "joda-time"    % "2.9.9"  % "optional",
      "org.joda"  % "joda-convert" % "1.9.2"  % "optional"
    )
  )
  .settings(
    publishTo := Some("TIM Group Repo" at "http://repo.youdevise.com:8081/nexus/content/repositories/yd-release-candidates")
  )
  .settings(credentials += Credentials(new File("/etc/sbt/credentials")))

