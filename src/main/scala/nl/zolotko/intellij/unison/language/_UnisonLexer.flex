package nl.zolotko.intellij.unison.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static nl.zolotko.intellij.unison.language.psi.UnisonElementTypes.*;

%%

%{
  public _UnisonLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _UnisonLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

%state INSTRING

NEWLINE=\r?\n
WHITE_SPACE=[\ \t\f]

NUMBER=\d+

STRING_SPAN=[^\"\\]+
STRING_ESCAPE_SEQUENCE=\\[0abfnrtvs\"'\\]

WORDY=(\.?[:letter:][a-zA-Z_0-9]*)+
BLANK=_([:letter:][a-zA-Z_0-9]*)?
SYMBOLY=(\.?[:letter:][a-zA-Z_0-9]*)*\.?(\!\$%\^&\*-=\+<>\.\~\\\/\|:)+  // !$%^&*-=+<>.~\\/|:

%%
<YYINITIAL> {
  {NEWLINE}                        { return NEWLINE; }
  {WHITE_SPACE}                    { return WHITE_SPACE; }

  "unique"                         { return UNIQUE; }
  "structural"                     { return STRUCTURAL; }
  "type"                           { return TYPE; }
  "ability"                        { return ABILITY; }
  "where"                          { return WHERE; }
  "match"                          { return MATCH; }
  "with"                           { return WITH; }
  "cases"                          { return CASES; }
  "otherwise"                      { return OTHERWISE; }
  "use"                            { return USE; }
  "true"                           { return TRUE; }
  "false"                          { return FALSE; }
  "lambda"                         { return LAMBDA; }
  "include"                        { return INCLUDE; }
  "signature"                      { return SIGNATURE; }
  "@signature"                     { return AT_SIGNATURE; }
  "@inlineSignature"               { return INLINE_SIGNATURE; }
  "@typecheck"                     { return AT_TYPECHECK; }
  "@eval"                          { return AT_EVAL; }
  "evaluate"                       { return EVALUATE; }
  "source"                         { return SOURCE; }
  "if"                             { return IF; }
  "then"                           { return THEN; }
  "else"                           { return ELSE; }
  "syntax.docUntitledSection"      { return SYNTAX_DOC_UNTITLED_SECTION; }
  "syntax.docColumn"               { return SYNTAX_DOC_COLUMN; }
  "typeLink"                       { return TYPE_LINK; }
  "termLink"                       { return TERM_LINK; }
  "test>"                          { return TEST_WATCH; }
  ">"                              { return WATCH; }
  "[:"                             { return OPEN; }
  ":]"                             { return CLOSE; }
  "."                              { return DOT; }
  ","                              { return COMMA; }
  "("                              { return PAREN1; }
  ")"                              { return PAREN2; }
  "["                              { return BRACKET1; }
  "]"                              { return BRACKET2; }
  "{{"                             { return DOC_OPEN; }
  "}}"                             { return DOC_CLOSE; }
  "{"                              { return BRACE1; }
  "}"                              { return BRACE2; }
  ":"                              { return COLON; }
  "forall"                         { return FORALL1; }
  "∀"                              { return FORALL2; }
  "="                              { return EQUAL; }
  "|"                              { return PIPE; }
  "||"                             { return OR; }
  "&&"                             { return AND; }
  "->"                             { return ARROW; }
  "@"                              { return AT; }
  "'"                              { return QUOTE; }
  "!"                              { return EXCLAMATION_MARK; }
  "`"                              { return BACK_QUOTE; }
  "---"                            { return FOLD; }
  "+"                              { return PLUS; }
  "-"                              { return MINUS; }
  "*"                              { return MUL; }
  "_"                              { return UNDERSCORE; }

  {NUMBER}                         { return NUMBER; }
  "\""                             {
                                      yybegin(INSTRING);
                                      return DOUBLE_QUOTE;
                                   }
  {WORDY}                          { return WORDY; }
  {BLANK}                          { return BLANK; }
  {SYMBOLY}                        { return SYMBOLY; }
}

<INSTRING> {
  {STRING_ESCAPE_SEQUENCE}        { return STRING_ESCAPE_SEQUENCE; }
  {STRING_SPAN}                   { return STRING_SPAN; }
  \"                              {
                                    yybegin(YYINITIAL);
                                    return DOUBLE_QUOTE;
                                  }
  [^]                             { return STRING_BAD_CHARACTER; }
}

[^] { return BAD_CHARACTER; }
