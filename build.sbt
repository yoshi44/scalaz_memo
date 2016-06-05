name := "scalaz_memo"

version := "1.0"

scalaVersion := "2.11.8"
val scalazVersion = "7.2.3"

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % scalazVersion,
  //"org.scalaz" %% "scalaz-effect" % scalazVersion,
  //"org.scalaz" %% "scalaz-typelevel" % scalazVersion,
  //"org.scalaz" %% "scalaz-scalacheck-binding" % scalazVersion % "test",
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"