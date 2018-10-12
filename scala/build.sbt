name := "scala"

version := "0.1"

scalaVersion := "2.12.7"

CommandAliases.addCommandAliases()

resolvers += Resolver.bintrayRepo("cakesolutions", "maven")

libraryDependencies += "com.danielasfregola" %% "twitter4s" % "5.5"
libraryDependencies += "net.cakesolutions" %% "scala-kafka-client" % "1.1.1"

libraryDependencies += "net.cakesolutions" %% "scala-kafka-client-testkit" % "1.1.1" % "test"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"

parallelExecution in Test := false