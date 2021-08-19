package nl.zolotko.intellij.unison.language.psi

import com.intellij.psi.tree.IElementType
import nl.zolotko.intellij.unison.language.UnisonLanguage

class UnisonTokenType(debugName: String) extends IElementType(debugName, UnisonLanguage) {
  override def toString: String = "UnisonTokenType." + super.toString
}
