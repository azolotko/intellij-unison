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
    tokenHighlights.getOrElse(tokenType, TextAttributesKey.EMPTY_ARRAY)

  private val tokenHighlights = Map(
    UnisonElementTypes.USE ->
      TextAttributesKey.createTextAttributesKey("UNISON.USE", DefaultLanguageHighlighterColors.KEYWORD),
    UnisonElementTypes.DOT ->
      TextAttributesKey.createTextAttributesKey("UNISON.DOT", DefaultLanguageHighlighterColors.DOT),
    UnisonElementTypes.ABILITY ->
      TextAttributesKey.createTextAttributesKey("UNISON.ABILITY", DefaultLanguageHighlighterColors.KEYWORD),
    UnisonElementTypes.AND ->
      TextAttributesKey.createTextAttributesKey("UNISON.AND", DefaultLanguageHighlighterColors.OPERATION_SIGN),
    UnisonElementTypes.ARROW ->
      TextAttributesKey.createTextAttributesKey("UNISON.ARROW", DefaultLanguageHighlighterColors.OPERATION_SIGN),
    UnisonElementTypes.AT ->
      TextAttributesKey.createTextAttributesKey("UNISON.AT", DefaultLanguageHighlighterColors.OPERATION_SIGN),
    UnisonElementTypes.BACK_QUOTE ->
      TextAttributesKey.createTextAttributesKey("UNISON.BACK_QUOTE", DefaultLanguageHighlighterColors.BRACES),
    UnisonElementTypes.BRACE1 ->
      TextAttributesKey.createTextAttributesKey("UNISON.BRACE1", DefaultLanguageHighlighterColors.BRACES),
    UnisonElementTypes.BRACE2 ->
      TextAttributesKey.createTextAttributesKey("UNISON.BRACE2", DefaultLanguageHighlighterColors.BRACES),
    UnisonElementTypes.BRACKET1 ->
      TextAttributesKey.createTextAttributesKey("UNISON.BRACKET1", DefaultLanguageHighlighterColors.BRACKETS),
    UnisonElementTypes.BRACKET2 ->
      TextAttributesKey.createTextAttributesKey("UNISON.BRACKET2", DefaultLanguageHighlighterColors.BRACKETS),
    UnisonElementTypes.CASES ->
      TextAttributesKey.createTextAttributesKey("UNISON.CASES", DefaultLanguageHighlighterColors.KEYWORD),
    UnisonElementTypes.CLOSE ->
      TextAttributesKey.createTextAttributesKey("UNISON.CLOSE", DefaultLanguageHighlighterColors.BLOCK_COMMENT),
    UnisonElementTypes.COLON ->
      TextAttributesKey.createTextAttributesKey("UNISON.COLON", DefaultLanguageHighlighterColors.OPERATION_SIGN),
    UnisonElementTypes.DOC_CLOSE ->
      TextAttributesKey.createTextAttributesKey("UNISON.DOC_CLOSE", DefaultLanguageHighlighterColors.BLOCK_COMMENT),
    UnisonElementTypes.DOC_OPEN ->
      TextAttributesKey.createTextAttributesKey("UNISON.DOC_OPEN", DefaultLanguageHighlighterColors.BLOCK_COMMENT),
    UnisonElementTypes.ELSE ->
      TextAttributesKey.createTextAttributesKey("UNISON.ELSE", DefaultLanguageHighlighterColors.KEYWORD),
    UnisonElementTypes.EQUAL ->
      TextAttributesKey.createTextAttributesKey("UNISON.EQUAL", DefaultLanguageHighlighterColors.OPERATION_SIGN),
    UnisonElementTypes.EVALUATE ->
      TextAttributesKey.createTextAttributesKey("UNISON.EVALUATE", DefaultLanguageHighlighterColors.KEYWORD),
    UnisonElementTypes.EXCLAMATION_MARK ->
      TextAttributesKey.createTextAttributesKey(
        "UNISON.EXCLAMATION_MARK",
        DefaultLanguageHighlighterColors.OPERATION_SIGN
      ),
    UnisonElementTypes.FALSE ->
      TextAttributesKey.createTextAttributesKey("UNISON.FALSE", DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL),
    UnisonElementTypes.FOLD ->
      TextAttributesKey.createTextAttributesKey("UNISON.FOLD", DefaultLanguageHighlighterColors.BLOCK_COMMENT),
    UnisonElementTypes.FORALL1 ->
      TextAttributesKey.createTextAttributesKey("UNISON.FORALL1", DefaultLanguageHighlighterColors.KEYWORD),
    UnisonElementTypes.FORALL2 ->
      TextAttributesKey.createTextAttributesKey("UNISON.FORALL2", DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL),
    UnisonElementTypes.IF ->
      TextAttributesKey.createTextAttributesKey("UNISON.IF", DefaultLanguageHighlighterColors.KEYWORD),
    UnisonElementTypes.INCLUDE ->
      TextAttributesKey.createTextAttributesKey("UNISON.INCLUDE", DefaultLanguageHighlighterColors.KEYWORD),
    UnisonElementTypes.LAMBDA ->
      TextAttributesKey.createTextAttributesKey("UNISON.LAMBDA", DefaultLanguageHighlighterColors.KEYWORD),
    UnisonElementTypes.MATCH ->
      TextAttributesKey.createTextAttributesKey("UNISON.MATCH", DefaultLanguageHighlighterColors.KEYWORD),
    UnisonElementTypes.MINUS ->
      TextAttributesKey.createTextAttributesKey("UNISON.MINUS", DefaultLanguageHighlighterColors.OPERATION_SIGN),
    UnisonElementTypes.MUL ->
      TextAttributesKey.createTextAttributesKey("UNISON.MUL", DefaultLanguageHighlighterColors.OPERATION_SIGN),
    UnisonElementTypes.OPEN ->
      TextAttributesKey.createTextAttributesKey("UNISON.OPEN", DefaultLanguageHighlighterColors.BLOCK_COMMENT),
    UnisonElementTypes.OR ->
      TextAttributesKey.createTextAttributesKey("UNISON.OR", DefaultLanguageHighlighterColors.OPERATION_SIGN),
    UnisonElementTypes.OTHERWISE ->
      TextAttributesKey.createTextAttributesKey("UNISON.OTHERWISE", DefaultLanguageHighlighterColors.KEYWORD),
    UnisonElementTypes.PAREN1 ->
      TextAttributesKey.createTextAttributesKey("UNISON.PAREN1", DefaultLanguageHighlighterColors.PARENTHESES),
    UnisonElementTypes.PAREN2 ->
      TextAttributesKey.createTextAttributesKey("UNISON.PAREN2", DefaultLanguageHighlighterColors.PARENTHESES),
    UnisonElementTypes.PIPE ->
      TextAttributesKey.createTextAttributesKey("UNISON.PIPE", DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL),
    UnisonElementTypes.PLUS ->
      TextAttributesKey.createTextAttributesKey("UNISON.PLUS", DefaultLanguageHighlighterColors.OPERATION_SIGN),
    UnisonElementTypes.QUOTE ->
      TextAttributesKey.createTextAttributesKey("UNISON.QUOTE", DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL),
    UnisonElementTypes.SIGNATURE ->
      TextAttributesKey.createTextAttributesKey("UNISON.SIGNATURE", DefaultLanguageHighlighterColors.KEYWORD),
    UnisonElementTypes.SOURCE ->
      TextAttributesKey.createTextAttributesKey("UNISON.SOURCE", DefaultLanguageHighlighterColors.KEYWORD),
    UnisonElementTypes.STRUCTURAL ->
      TextAttributesKey.createTextAttributesKey("UNISON.STRUCTURAL", DefaultLanguageHighlighterColors.KEYWORD),
    UnisonElementTypes.STRUCTURAL ->
      TextAttributesKey.createTextAttributesKey("UNISON.STRUCTURAL", DefaultLanguageHighlighterColors.KEYWORD),
    UnisonElementTypes.THEN ->
      TextAttributesKey.createTextAttributesKey("UNISON.THEN", DefaultLanguageHighlighterColors.KEYWORD),
    UnisonElementTypes.TRUE ->
      TextAttributesKey.createTextAttributesKey("UNISON.TRUE", DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL),
    UnisonElementTypes.TYPE ->
      TextAttributesKey.createTextAttributesKey("UNISON.TYPE", DefaultLanguageHighlighterColors.KEYWORD),
    UnisonElementTypes.TYPE_LINK ->
      TextAttributesKey.createTextAttributesKey("UNISON.TYPE_LINK", DefaultLanguageHighlighterColors.KEYWORD),
    UnisonElementTypes.TERM_LINK ->
      TextAttributesKey.createTextAttributesKey("UNISON.TERM_LINK", DefaultLanguageHighlighterColors.KEYWORD),
    UnisonElementTypes.TEST_WATCH ->
      TextAttributesKey.createTextAttributesKey("UNISON.TEST_WATCH", DefaultLanguageHighlighterColors.LABEL),
    UnisonElementTypes.WATCH ->
      TextAttributesKey.createTextAttributesKey("UNISON.WATCH", DefaultLanguageHighlighterColors.LABEL),
    UnisonElementTypes.UNIQUE ->
      TextAttributesKey.createTextAttributesKey("UNISON.UNIQUE", DefaultLanguageHighlighterColors.KEYWORD),
    UnisonElementTypes.USE ->
      TextAttributesKey.createTextAttributesKey("UNISON.USE", DefaultLanguageHighlighterColors.KEYWORD),
    UnisonElementTypes.WHERE ->
      TextAttributesKey.createTextAttributesKey("UNISON.WHERE", DefaultLanguageHighlighterColors.KEYWORD),
    UnisonElementTypes.WITH ->
      TextAttributesKey.createTextAttributesKey("UNISON.WITH", DefaultLanguageHighlighterColors.KEYWORD),
    UnisonElementTypes.UNDERSCORE ->
      TextAttributesKey.createTextAttributesKey(
        "UNISON.UNDERSCORE",
        DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL
      ),
    UnisonElementTypes.NUMBER ->
      TextAttributesKey.createTextAttributesKey("UNISON.NUMBER", DefaultLanguageHighlighterColors.NUMBER),
    UnisonElementTypes.STRING ->
      TextAttributesKey.createTextAttributesKey("UNISON.STRING", DefaultLanguageHighlighterColors.STRING),
    UnisonElementTypes.DOUBLE_QUOTE ->
      TextAttributesKey.createTextAttributesKey("UNISON.DOUBLE_QUOTE", DefaultLanguageHighlighterColors.STRING),
    UnisonElementTypes.STRING_SPAN ->
      TextAttributesKey.createTextAttributesKey("UNISON.STRING_SPAN", DefaultLanguageHighlighterColors.STRING),
    UnisonElementTypes.STRING_ESCAPE_SEQUENCE ->
      TextAttributesKey.createTextAttributesKey(
        "UNISON.STRING_ESCAPE_SEQUENCE",
        DefaultLanguageHighlighterColors.VALID_STRING_ESCAPE
      ),
    UnisonElementTypes.STRING_BAD_CHARACTER ->
      TextAttributesKey.createTextAttributesKey(
        "UNISON.STRING_BAD_CHARACTER",
        DefaultLanguageHighlighterColors.INVALID_STRING_ESCAPE
      ),
    UnisonElementTypes.WORDY ->
      TextAttributesKey.createTextAttributesKey("UNISON.WORDY", DefaultLanguageHighlighterColors.IDENTIFIER),
    UnisonElementTypes.SYMBOLY ->
      TextAttributesKey.createTextAttributesKey("UNISON.SYMBOLY", DefaultLanguageHighlighterColors.IDENTIFIER)
  ).view.mapValues(SyntaxHighlighterBase.pack)
}
