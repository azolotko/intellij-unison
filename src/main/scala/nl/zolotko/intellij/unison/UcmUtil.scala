package nl.zolotko.intellij.unison

object UcmUtil {
  def ucmVersion(ucmPath: String): Option[String] = {
    import sys.process.*
    val firstLine = s"$ucmPath version".lazyLines.headOption
    firstLine.flatMap(UcmUtil.extractVersion)
  }

  def extractVersion(line: String): Option[String] =
    line.linesIterator.nextOption().collectFirst { case s"ucm version: $version" =>
      val v = version.strip()
      v.substring(0, Math.min(v.length, 64))
    }
}
