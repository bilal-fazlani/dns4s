/*
 * Copyright 2014-2019 Michael Krolikowski
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.11")

addSbtPlugin("com.typesafe.sbt" % "sbt-osgi" % "0.9.5")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.1")

addSbtPlugin("com.eed3si9n" % "sbt-unidoc" % "0.4.2")

addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "1.3.2")

addSbtPlugin("io.github.jonas" % "sbt-paradox-material-theme" % "0.6.0")

addSbtPlugin("org.tpolecat" % "tut-plugin" % "0.6.12")

addSbtPlugin("com.typesafe.sbt" % "sbt-ghpages" % "0.6.3")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.6.0")

addSbtPlugin("org.scoverage" % "sbt-coveralls" % "1.2.7")

addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.3.0")

addSbtPlugin("de.heikoseeberger" % "sbt-header" % "5.2.0")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.0.4")

addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.4")
