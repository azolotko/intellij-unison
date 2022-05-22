import org.jetbrains.sbtidea.Keys._

ThisBuild / scalaVersion       := "3.1.2"
ThisBuild / intellijPluginName := "intellij-unison"
ThisBuild / intellijBuild      := "221.5591.52"
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
      Test / unmanagedResourceDirectories += baseDirectory.value / "testResources",
      libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
    )
