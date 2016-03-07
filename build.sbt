import AssemblyKeys._

name := "rest"

version := "1.0"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
    "io.spray" % "spray-can" % "1.1-M8",
    "io.spray" % "spray-http" % "1.1-M8",
    "io.spray" % "spray-routing" % "1.1-M8",
    "net.liftweb" % "lift-json_2.10" % "2.5.1",
    "com.typesafe.slick" % "slick_2.10" % "1.0.1",
    "mysql" % "mysql-connector-java" % "5.1.25",
    "com.typesafe.akka" % "akka-actor_2.10" % "2.1.4",
    "com.typesafe.akka" % "akka-slf4j_2.10" % "2.1.4",
    "ch.qos.logback" % "logback-classic" % "1.0.13",
    "org.scala-lang" % "scala-compiler" % "2.10.2",
    "org.scala-lang" % "scala-reflect" % "2.10.2"
)

resolvers ++= Seq(
    "Spray repository" at "http://repo.spray.io",
    "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
)

assemblySettings
