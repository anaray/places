name := "hubs"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
   "net.sf.sprockets" % "sprockets" % "1.3.0"
)     

play.Project.playJavaSettings
