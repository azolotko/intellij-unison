import org.jetbrains.sbtidea.Keys._

ThisBuild / scalaVersion := "2.13.6"
//ThisBuild / scalaVersion := "3.0.1"
ThisBuild / intellijPluginName := "intellij-unison"
ThisBuild / intellijBuild := "212.4746.92"
ThisBuild / intellijPlatform := IntelliJPlatform.IdeaCommunity

lazy val intellijUnison =
  project
    .in(file("."))
    .enablePlugins(SbtIdeaPlugin)
    .settings(
      version := "0.0.1-SNAPSHOT",
      Global / intellijAttachSources := true,
      Compile / javacOptions ++= Seq("--release", "11"),
      intellijPlugins += "com.intellij.properties".toPlugin,
      Compile / unmanagedResourceDirectories += baseDirectory.value / "resources",
      Test / unmanagedResourceDirectories += baseDirectory.value / "testResources"
    )
