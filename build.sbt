name := "ScalaPlayground"

version := "0.1"

scalaVersion := "2.13.4"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test

enablePlugins(SiteScaladocPlugin)
enablePlugins(GhpagesPlugin)
git.remoteRepo := "git@github.com:AlexHedley/ScalaPlayground.git"
