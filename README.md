sbt-utc
=======
[![Build Status](https://travis-ci.org/youdevise/sbt-utc.svg?branch=master)](https://travis-ci.org/youdevise/sbt-utc)


Summary
-------
Enables developers in different timezones to always have a consistent timezone.  Sets timezone of SBT build to UTC.

Usage
-----
Not yet published to a Maven or Ivy central repository---please open up an Issue if you find this plugin useful and would like it published.

Workaround: compile locally and publish locally:

     sbt -DBUILD_VERSION=1 publishLocal

Add to `project/plugins.sbt`:

     addSbtPlugin("com.timgroup" % "sbt-utc" % "0.0.1")
     
