import play.PlayJava

val appName = "odenktools api"
val appVersion = "1.0"

lazy val odenktools_api = (project in file(".")).enablePlugins(PlayJava,DockerPlugin)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaCore,
  cache,
  javaWs,
  javaJdbc,
  javaEbean,
  "org.postgresql" % "postgresql" % "9.4-1201-jdbc41",
  "com.wordnik" %% "swagger-play2" % "1.3.12" exclude("org.reflections", "reflections"),
  "org.reflections" % "reflections" % "0.9.8" notTransitive(),
  "org.webjars" % "swagger-ui" % "2.1.8-M1",
  "commons-io" % "commons-io" % "2.4",
  "org.apache.poi" % "poi" % "3.8", "org.apache.poi" % "poi-ooxml" % "3.9",
  "com.itextpdf" % "itextpdf" % "5.5.10",
  "com.itextpdf.tool" % "xmlworker" % "5.5.10",
  "com.auth0" % "java-jwt" % "3.2.0",
  "org.apache.tika" % "tika-core" % "1.16",
  "org.mockito" % "mockito-core" % "1.9.5" % "test"
)

resolvers ++= Seq(
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
  "Apache Repository" at "https://repository.apache.org/content/repositories/releases/",
  Resolver.sonatypeRepo("public"),
  Resolver.mavenLocal,
  Resolver.sonatypeRepo("releases"),
  Resolver.typesafeRepo("releases")
)

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

javaOptions in Test ++= Seq(
  "-Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=9998",
  "-Xms512M",
  "-Xmx1536M",
  "-Xss1M",
  "-XX:MaxPermSize=384M"
)


libraryDependencies += filters

EclipseKeys.projectFlavor := EclipseProjectFlavor.Java

parallelExecution in Test := false

logBuffered := false

libraryDependencies += filters

EclipseKeys.projectFlavor := EclipseProjectFlavor.Java

fork in run := true
