package com.timgroup.sbtutc

import sbt._
import Keys._
import java.util.TimeZone
import org.joda.time.DateTimeZone

object SbtUtcPlugin extends Plugin {
  println("Setting Java TimeZone default to UTC")
  System.setProperty("user.timezone", "UTC")
  TimeZone.setDefault(TimeZone.getTimeZone("UTC"))
  if (isPresent("org.joda.time.DateTimeZone")) {
    println("Setting JodaTime DateTimeZone default to UTC")
    DateTimeZone.setDefault(DateTimeZone.UTC)
  }

  override lazy val globalSettings = Seq(javaOptions += "-Duser.timezone=UTC")

  private def isPresent(className: String) = (scala.util.control.Exception.allCatch opt { Class.forName(className) }).isDefined
}
