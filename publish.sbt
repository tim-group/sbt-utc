// For information on how to get set up to publish signed artifacts to 
// Maven Central via Sonatye using SBT, please see the documentation:
//   http://www.scala-sbt.org/0.13/docs/Using-Sonatype.html
//
// Note that, in order to correctly publish cross-built libraries against
// multiple Scala versions, I've also had to do follow this documentation:
//   http://www.scala-sbt.org/0.13/docs/Combined+Pages.html#Cross-building

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

licenses := Seq("MIT License" -> url("http://www.opensource.org/licenses/mit-license.php"))

homepage := Some(url("http://jsuereth.com/scala-arm"))

pomExtra := (
  <scm>
    <url>git@github.com:tim-group/sbt-utc.git</url>
    <connection>scm:git:git@github.com:tim-group/sbt-utc.git</connection>
  </scm>
  <developers>
    <developer>
      <id>flicken</id>
      <name>Brian Roberts</name>
      <url>https://github.com/flicken</url>
    </developer>
  </developers>
)
