(Tested on Windows 24.05.2015)

# **Install Java SE Development Kit 8u45 +**

Update systemvariable and reboot Windows!

```
JAVA_HOME=C:\...\Java\jdk1.8.0_45
```

# **Eclipse Plugin**

```help -> Eclipse Marketplace -> search "javafx" or "e(fx)clipse" -> install e(fx)clipse```

Need help? see: [e(fx)clipse](http://www.eclipse.org/efxclipse/install.html)

# **SBT setup**

**build.sbt**

```sbt
addCompilerPlugin("org.scalamacros" % "paradise" % "2.0.1" cross CrossVersion.full)

libraryDependencies += "org.scalafx" %% "scalafx" % "8.0.40-R8"

libraryDependencies += "org.scalafx" %% "scalafxml-core-sfx8" % "0.2.2"
```

Source:

Need help? see: https://github.com/vigoo/scalafxml

Need help? see: https://github.com/scalafx/scalafx


# **Scene Builder 8.0**
http://gluonhq.com/products/downloads/

OR

# **Scene Builder 2.0**
http://www.oracle.com/technetwork/java/javase/downloads/javafxscenebuilder-1x-archive-2199384.html

# **Execute**

**console **

```
sbt run
```

**Build Jar**

```
sbt assembly
```

Need help? see: //TODO My assembly example

Need help? see: https://github.com/sbt/sbt-assembly