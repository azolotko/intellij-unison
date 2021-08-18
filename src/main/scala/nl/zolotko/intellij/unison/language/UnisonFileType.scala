package nl.zolotko.intellij.unison.language

import com.intellij.openapi.fileTypes.{FileType, LanguageFileType}

import javax.swing.Icon

object UnisonFileType extends LanguageFileType(UnisonLanguage) {
  override def getName: String = "Unison Scratch File"

  override def getDescription: String = "Unison language scratch file"

  override def getDefaultExtension: String = "u"

  override def getIcon: Icon = UnisonIcons.file
}