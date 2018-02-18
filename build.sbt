import play.PlayJava
import sbt._
import Keys._
import play.Play.autoImport._
import PlayKeys._

val appName = "odenktools api"
val appVersion = "1.0"

lazy val odenktools_api = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaCore,
  cache,
  javaWs,
  javaJdbc,
  javaEbean,
  "org.postgresql" % "postgresql" % "9.4-1201-jdbc41",
  "org.webjars" % "swagger-ui" % "2.1.8-M1",
  "commons-io" % "commons-io" % "2.4",
  "com.auth0" % "java-jwt" % "3.2.0",
  "org.axonframework" % "axon-amqp" % "2.4.3",
  "org.mockito" % "mockito-core" % "1.9.5" % "test"
)

resolvers ++= Seq(
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
  "Apache Repository" at "https://repository.apache.org/content/repositories/releases/",
  Resolver.sonatypeRepo("public"),
  Resolver.sonatypeRepo("releases")
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

parallelExecution in Test := false

fork in run := true
