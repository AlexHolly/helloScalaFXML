Tested(24.05.2015) on Windows, sbt 0.13.6, scala 2.11.6, java se 1.8.0_45

# **Install Java SE Development Kit 8u45 +**

Update systemvariable and reboot Windows!

```
JAVA_HOME=C:\...\Java\jdk1.8.0_45
```

# **Eclipse Plugin**

```help -> Eclipse Marketplace -> search "javafx" or "e(fx)clipse" -> install e(fx)clipse```

Source: [e(fx)clipse](http://www.eclipse.org/efxclipse/install.html)

# **SBT setup**

**build.sbt**

```sbt
addCompilerPlugin("org.scalamacros" % "paradise" % "2.0.1" cross CrossVersion.full)

libraryDependencies += "org.scalafx" %% "scalafx" % "8.0.40-R8"

libraryDependencies += "org.scalafx" %% "scalafxml-core-sfx8" % "0.2.2"

unmanagedJars in Compile += Attributed.blank(file(System.getenv("JAVA_HOME") + "/jre/lib/ext/jfxrt.jar"))
```

Source: https://github.com/vigoo/scalafxml : https://github.com/scalafx/scalafx


# **Scene Builder 8.0**
http://gluonhq.com/products/downloads/

OR

# **Scene Builder 2.0**
http://www.oracle.com/technetwork/java/javase/downloads/javafxscenebuilder-1x-archive-2199384.html

# **How to run**

**Console**

```
sbt run
```

**Build Jar**

```
sbt assembly
```

Source: https://github.com/AlexHolly/helloScalaExecutableJar : https://github.com/sbt/sbt-assembly
