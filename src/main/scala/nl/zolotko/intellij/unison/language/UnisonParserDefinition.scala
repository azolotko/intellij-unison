package nl.zolotko.intellij.unison.language;

import com.intellij.lang.ParserDefinition.SpaceRequirements
import com.intellij.lang.{ASTNode, ParserDefinition, PsiParser}
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.tree.{IFileElementType, TokenSet}
import com.intellij.psi.{FileViewProvider, PsiElement, PsiFile, TokenType}
import nl.zolotko.intellij.unison.language.parser.UnisonParser
import nl.zolotko.intellij.unison.language.psi.UnisonFileElementType
import nl.zolotko.intellij.unison.language.psi.UnisonElementTypes.Factory

class UnisonParserDefinition extends ParserDefinition {
  override def createLexer(project: Project): Lexer =
    new UnisonLexerAdapter

  override val getCommentTokens: TokenSet =
    UnisonParserDefinition.comments

  override val getStringLiteralElements: TokenSet =
    UnisonParserDefinition.stringLiterals

  override def createParser(project: Project): PsiParser =
    new UnisonParser

  override val getWhitespaceTokens: TokenSet =
    UnisonParserDefinition.whitespaces

  override val getFileNodeType: IFileElementType =
    UnisonFileElementType

  override def createFile(viewProvider: FileViewProvider): UnisonFile =
    new UnisonFile(viewProvider)

  override def createElement(node: ASTNode): PsiElement =
    Factory.createElement(node)
}

object UnisonParserDefinition {
  val whitespaces: TokenSet    = TokenSet.create(TokenType.WHITE_SPACE)
  val comments: TokenSet       = TokenSet.EMPTY
  val stringLiterals: TokenSet = TokenSet.EMPTY
}
