// This is a generated file. Not intended for manual editing.
package nl.zolotko.intellij.unison.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import nl.zolotko.intellij.unison.language.psi.impl.*;

public interface UnisonElementTypes {

  IElementType ABILITY_CONSTRUCTOR = new UnisonElementType("ABILITY_CONSTRUCTOR");
  IElementType ABILITY_CONSTRUCTORS = new UnisonElementType("ABILITY_CONSTRUCTORS");
  IElementType ABILITY_NAME = new UnisonElementType("ABILITY_NAME");
  IElementType ABILITY_TYPE_ARG = new UnisonElementType("ABILITY_TYPE_ARG");
  IElementType ABILITY_TYPE_ARGS = new UnisonElementType("ABILITY_TYPE_ARGS");
  IElementType DATA_DECLARATION = new UnisonElementType("DATA_DECLARATION");
  IElementType DECLARATION = new UnisonElementType("DECLARATION");
  IElementType DECLARATIONS = new UnisonElementType("DECLARATIONS");
  IElementType EFFECT_DECLARATION = new UnisonElementType("EFFECT_DECLARATION");
  IElementType IMPORT = new UnisonElementType("IMPORT");
  IElementType IMPORTS = new UnisonElementType("IMPORTS");
  IElementType IMPORT_DOT_ID = new UnisonElementType("IMPORT_DOT_ID");
  IElementType IMPORT_PREFIX = new UnisonElementType("IMPORT_PREFIX");
  IElementType IMPORT_SUFFIX = new UnisonElementType("IMPORT_SUFFIX");
  IElementType IMPORT_SYMBOLY_ID = new UnisonElementType("IMPORT_SYMBOLY_ID");
  IElementType IMPORT_WORDY_ID = new UnisonElementType("IMPORT_WORDY_ID");
  IElementType MODIFIER = new UnisonElementType("MODIFIER");
  IElementType OTHER_EXPRESSION = new UnisonElementType("OTHER_EXPRESSION");
  IElementType PREFIX_DEFINITION_NAME = new UnisonElementType("PREFIX_DEFINITION_NAME");
  IElementType RESERVED = new UnisonElementType("RESERVED");
  IElementType SEMI = new UnisonElementType("SEMI");
  IElementType STRING = new UnisonElementType("STRING");
  IElementType SYMBOLY_DEFINITION_NAME = new UnisonElementType("SYMBOLY_DEFINITION_NAME");
  IElementType SYMBOLY_ID = new UnisonElementType("SYMBOLY_ID");
  IElementType WORDY_DEFINITION_NAME = new UnisonElementType("WORDY_DEFINITION_NAME");
  IElementType WORDY_ID = new UnisonElementType("WORDY_ID");

  IElementType ABILITY = new UnisonTokenType("ability");
  IElementType AND = new UnisonTokenType("&&");
  IElementType ARROW = new UnisonTokenType("->");
  IElementType AT = new UnisonTokenType("@");
  IElementType AT_EVAL = new UnisonTokenType("@eval");
  IElementType AT_SIGNATURE = new UnisonTokenType("@signature");
  IElementType AT_TYPECHECK = new UnisonTokenType("@typecheck");
  IElementType BACK_QUOTE = new UnisonTokenType("`");
  IElementType BLANK = new UnisonTokenType("blank");
  IElementType BRACE1 = new UnisonTokenType("{");
  IElementType BRACE2 = new UnisonTokenType("}");
  IElementType BRACKET1 = new UnisonTokenType("[");
  IElementType BRACKET2 = new UnisonTokenType("]");
  IElementType CASES = new UnisonTokenType("cases");
  IElementType CLOSE = new UnisonTokenType(":]");
  IElementType COLON = new UnisonTokenType(":");
  IElementType COMMA = new UnisonTokenType(",");
  IElementType DOC_CLOSE = new UnisonTokenType("}}");
  IElementType DOC_OPEN = new UnisonTokenType("{{");
  IElementType DOT = new UnisonTokenType(".");
  IElementType DOUBLE_QUOTE = new UnisonTokenType("double_quote");
  IElementType ELSE = new UnisonTokenType("else");
  IElementType EQUAL = new UnisonTokenType("=");
  IElementType EVALUATE = new UnisonTokenType("evaluate");
  IElementType EXCLAMATION_MARK = new UnisonTokenType("!");
  IElementType FALSE = new UnisonTokenType("false");
  IElementType FOLD = new UnisonTokenType("---");
  IElementType FORALL1 = new UnisonTokenType("forall");
  IElementType FORALL2 = new UnisonTokenType("∀");
  IElementType IF = new UnisonTokenType("if");
  IElementType INCLUDE = new UnisonTokenType("include");
  IElementType INLINE_SIGNATURE = new UnisonTokenType("@inlineSignature");
  IElementType LAMBDA = new UnisonTokenType("lambda");
  IElementType MATCH = new UnisonTokenType("match");
  IElementType MINUS = new UnisonTokenType("-");
  IElementType MUL = new UnisonTokenType("*");
  IElementType NEWLINE = new UnisonTokenType("newline");
  IElementType NUMBER = new UnisonTokenType("number");
  IElementType OPEN = new UnisonTokenType("[:");
  IElementType OR = new UnisonTokenType("||");
  IElementType OTHERWISE = new UnisonTokenType("otherwise");
  IElementType PAREN1 = new UnisonTokenType("(");
  IElementType PAREN2 = new UnisonTokenType(")");
  IElementType PIPE = new UnisonTokenType("|");
  IElementType PLUS = new UnisonTokenType("+");
  IElementType QUOTE = new UnisonTokenType("'");
  IElementType SIGNATURE = new UnisonTokenType("signature");
  IElementType SOURCE = new UnisonTokenType("source");
  IElementType STRING_BAD_CHARACTER = new UnisonTokenType("string_bad_character");
  IElementType STRING_ESCAPE_SEQUENCE = new UnisonTokenType("string_escape_sequence");
  IElementType STRING_SPAN = new UnisonTokenType("string_span");
  IElementType STRUCTURAL = new UnisonTokenType("structural");
  IElementType SYMBOLY = new UnisonTokenType("symboly");
  IElementType SYNTAX_DOC_COLUMN = new UnisonTokenType("syntax.docColumn");
  IElementType SYNTAX_DOC_UNTITLED_SECTION = new UnisonTokenType("syntax.docUntitledSection");
  IElementType TERM_LINK = new UnisonTokenType("termLink");
  IElementType TEST_WATCH = new UnisonTokenType("test>");
  IElementType THEN = new UnisonTokenType("then");
  IElementType TRUE = new UnisonTokenType("true");
  IElementType TYPE = new UnisonTokenType("type");
  IElementType TYPE_LINK = new UnisonTokenType("typeLink");
  IElementType UNDERSCORE = new UnisonTokenType("_");
  IElementType UNIQUE = new UnisonTokenType("unique");
  IElementType USE = new UnisonTokenType("use");
  IElementType WATCH = new UnisonTokenType(">");
  IElementType WHERE = new UnisonTokenType("where");
  IElementType WITH = new UnisonTokenType("with");
  IElementType WORDY = new UnisonTokenType("wordy");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ABILITY_CONSTRUCTOR) {
        return new UnisonAbilityConstructorImpl(node);
      }
      else if (type == ABILITY_CONSTRUCTORS) {
        return new UnisonAbilityConstructorsImpl(node);
      }
      else if (type == ABILITY_NAME) {
        return new UnisonAbilityNameImpl(node);
      }
      else if (type == ABILITY_TYPE_ARG) {
        return new UnisonAbilityTypeArgImpl(node);
      }
      else if (type == ABILITY_TYPE_ARGS) {
        return new UnisonAbilityTypeArgsImpl(node);
      }
      else if (type == DATA_DECLARATION) {
        return new UnisonDataDeclarationImpl(node);
      }
      else if (type == DECLARATION) {
        return new UnisonDeclarationImpl(node);
      }
      else if (type == DECLARATIONS) {
        return new UnisonDeclarationsImpl(node);
      }
      else if (type == EFFECT_DECLARATION) {
        return new UnisonEffectDeclarationImpl(node);
      }
      else if (type == IMPORT) {
        return new UnisonImportImpl(node);
      }
      else if (type == IMPORTS) {
        return new UnisonImportsImpl(node);
      }
      else if (type == IMPORT_DOT_ID) {
        return new UnisonImportDotIdImpl(node);
      }
      else if (type == IMPORT_PREFIX) {
        return new UnisonImportPrefixImpl(node);
      }
      else if (type == IMPORT_SUFFIX) {
        return new UnisonImportSuffixImpl(node);
      }
      else if (type == IMPORT_SYMBOLY_ID) {
        return new UnisonImportSymbolyIdImpl(node);
      }
      else if (type == IMPORT_WORDY_ID) {
        return new UnisonImportWordyIdImpl(node);
      }
      else if (type == MODIFIER) {
        return new UnisonModifierImpl(node);
      }
      else if (type == OTHER_EXPRESSION) {
        return new UnisonOtherExpressionImpl(node);
      }
      else if (type == PREFIX_DEFINITION_NAME) {
        return new UnisonPrefixDefinitionNameImpl(node);
      }
      else if (type == RESERVED) {
        return new UnisonReservedImpl(node);
      }
      else if (type == SEMI) {
        return new UnisonSemiImpl(node);
      }
      else if (type == STRING) {
        return new UnisonStringImpl(node);
      }
      else if (type == SYMBOLY_DEFINITION_NAME) {
        return new UnisonSymbolyDefinitionNameImpl(node);
      }
      else if (type == SYMBOLY_ID) {
        return new UnisonSymbolyIdImpl(node);
      }
      else if (type == WORDY_DEFINITION_NAME) {
        return new UnisonWordyDefinitionNameImpl(node);
      }
      else if (type == WORDY_ID) {
        return new UnisonWordyIdImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
