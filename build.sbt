jarName in assembly := "helloscalafxml.jar"

assemblyOption in assembly := (assemblyOption in assembly).value.copy(cacheUnzip = false)

mergeStrategy in assembly := {
    case PathList("META-INF", xs @ _*) =>
     (xs map {_.toLowerCase}) match {
       case ("manifest.mf" :: Nil) | ("index.list" :: Nil) |
            ("dependencies" :: Nil) => MergeStrategy.discard
       case _ => MergeStrategy.discard
     }
    case _ => MergeStrategy.first
}

name := "helloScalaFXML"

organization := "helloscalafxml"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.6"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.0.1" cross CrossVersion.full)

scalacOptions in ThisBuild ++= Seq("-unchecked", "-deprecation", "-feature")

libraryDependencies += "org.scalafx" %% "scalafx" % "8.0.40-R8"

libraryDependencies += "org.scalafx" %% "scalafxml-core-sfx8" % "0.2.2"

unmanagedJars in Compile += Attributed.blank(file(System.getenv("JAVA_HOME") + "/jre/lib/ext/jfxrt.jar"))
