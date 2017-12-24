lazy val `scala-json-rpc` = project
  .in(file("scala-json-rpc"))
  .settings(
    name := "scala-json-rpc"
  )
  .settings(
    libraryDependencies ++= Seq(
      "com.typesafe.play" %% "play-json" % "2.6.8",
      "org.scalatest" %% "scalatest" % "3.0.4" % Test
    ))
