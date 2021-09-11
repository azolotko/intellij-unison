package nl.zolotko.intellij.unison.language

import com.intellij.lexer.FlexAdapter

class UnisonLexerAdapter extends FlexAdapter(new _UnisonLexer(null))
