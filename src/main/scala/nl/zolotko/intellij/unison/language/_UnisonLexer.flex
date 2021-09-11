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

EOL=\r|\n|\r\n
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

WORDY=[:letter:][a-zA-Z_0-9]*
SYMBOLY=[:letter:][a-zA-Z_0-9]*

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "use"              { return USE; }
  "."                { return DOT; }

  {WORDY}            { return WORDY; }
  {SYMBOLY}          { return SYMBOLY; }

}

[^] { return BAD_CHARACTER; }
