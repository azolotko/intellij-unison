package nl.zolotko.intellij.unison.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import nl.zolotko.intellij.unison.language.psi.UnisonTypes;
import com.intellij.psi.TokenType;

%%

%class UnisonLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF=\R
WHITE_SPACE=[\ \n\t\f]

%state WAITING_VALUE

%%

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

[^]                                                         { return TokenType.BAD_CHARACTER; }