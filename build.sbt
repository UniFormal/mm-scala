lazy val root = (project in file(".")).
  settings(
    name := "mm-scala",
    version := "1.0.1",
  )
libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.4"
scalacOptions += "-feature"
