package nl.zolotko.intellij.unison.language

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import nl.zolotko.intellij.unison.language.{UnisonFileType, UnisonLanguage}

class UnisonFile(viewProvider: FileViewProvider) extends PsiFileBase(viewProvider, UnisonLanguage) {
  override val getFileType: FileType = UnisonFileType

  override def toString: String = s"UnisonFile: $getName"
}
