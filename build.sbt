import org.jetbrains.sbtidea.Keys._

ThisBuild / scalaVersion       := "3.1.0"
ThisBuild / intellijPluginName := "intellij-unison"
ThisBuild / intellijPlatform   := IntelliJPlatform.IdeaCommunity

lazy val `intellij-unison` =
  project
    .in(file("."))
    .enablePlugins(SbtIdeaPlugin)
    .settings(
      version := "0.0.1-SNAPSHOT",
      Compile / unmanagedSourceDirectories += baseDirectory.value / "gen",
      Compile / javacOptions ++= Seq("--release", "11"),
      Compile / unmanagedResourceDirectories += baseDirectory.value / "resources",
      intellijPlugins += "com.intellij.properties".toPlugin,
      Global / intellijAttachSources := true,
      Test / unmanagedResourceDirectories += baseDirectory.value / "testResources"
    )
