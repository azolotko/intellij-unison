package nl.zolotko.intellij.unison

import com.intellij.DynamicBundle
import org.jetbrains.annotations.{Nls, PropertyKey}

import scala.annotation.varargs

object UnisonBundle extends DynamicBundle("messages.UnisonBundle") {
  def message(@PropertyKey(resourceBundle = "messages.UnisonBundle") key: String, params: Any*): String =
    getMessage(key, params.map(_.toString): _*)
}
