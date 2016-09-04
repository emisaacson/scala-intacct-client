credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
resolvers +=  Resolver.url(
  "meetup-sbt-plugins",
  new java.net.URL("https://dl.bintray.com/meetup/sbt-plugins/")
)(Resolver.ivyStylePatterns)

addSbtPlugin("com.meetup" % "sbt-plugins" % "0.2.21")

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.3.0")