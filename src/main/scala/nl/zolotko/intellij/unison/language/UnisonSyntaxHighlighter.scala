package nl.zolotko.intellij.unison.language

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import nl.zolotko.intellij.unison.language.psi.UnisonElementTypes

class UnisonSyntaxHighlighter extends SyntaxHighlighterBase {
  override def getHighlightingLexer: Lexer = new UnisonHighlightingLexer()

  override def getTokenHighlights(tokenType: IElementType): Array[TextAttributesKey] =
    tokenType match {
      case UnisonElementTypes.USE =>
        SyntaxHighlighterBase.pack(
          TextAttributesKey.createTextAttributesKey("UNISON.USE", DefaultLanguageHighlighterColors.KEYWORD)
        )

      case UnisonElementTypes.DOT =>
        SyntaxHighlighterBase.pack(
          TextAttributesKey.createTextAttributesKey("UNISON.DOT", DefaultLanguageHighlighterColors.DOT)
        )

      case UnisonElementTypes.WORDY =>
        SyntaxHighlighterBase.pack(
          TextAttributesKey.createTextAttributesKey("UNISON.WORDY", DefaultLanguageHighlighterColors.IDENTIFIER)
        )

      case UnisonElementTypes.SYMBOLY =>
        SyntaxHighlighterBase.pack(
          TextAttributesKey.createTextAttributesKey("UNISON.SYMBOLY", DefaultLanguageHighlighterColors.IDENTIFIER)
        )

      case _ => TextAttributesKey.EMPTY_ARRAY
    }
}
