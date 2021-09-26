// This is a generated file. Not intended for manual editing.
package nl.zolotko.intellij.unison.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static nl.zolotko.intellij.unison.language.psi.UnisonElementTypes.*;
import static nl.zolotko.intellij.unison.language.parser.UnisonParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class UnisonParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return File(b, l + 1);
  }

  /* ********************************************************** */
  // Import | ((Reserved | String) | newline)
  public static boolean Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = Import(b, l + 1);
    if (!r) r = Expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (Reserved | String) | newline
  private static boolean Expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression_1_0(b, l + 1);
    if (!r) r = consumeToken(b, NEWLINE);
    exit_section_(b, m, null, r);
    return r;
  }

  // Reserved | String
  private static boolean Expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1_0")) return false;
    boolean r;
    r = Reserved(b, l + 1);
    if (!r) r = String(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // Imports? Expression*
  static boolean File(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "File")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = File_0(b, l + 1);
    r = r && File_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Imports?
  private static boolean File_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "File_0")) return false;
    Imports(b, l + 1);
    return true;
  }

  // Expression*
  private static boolean File_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "File_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "File_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // use ImportPrefix ImportSuffix* newline
  public static boolean Import(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Import")) return false;
    if (!nextTokenIs(b, USE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USE);
    r = r && ImportPrefix(b, l + 1);
    r = r && Import_2(b, l + 1);
    r = r && consumeToken(b, NEWLINE);
    exit_section_(b, m, IMPORT, r);
    return r;
  }

  // ImportSuffix*
  private static boolean Import_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Import_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ImportSuffix(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Import_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // dot
  public static boolean ImportDotId(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDotId")) return false;
    if (!nextTokenIs(b, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    exit_section_(b, m, IMPORT_DOT_ID, r);
    return r;
  }

  /* ********************************************************** */
  // (ImportWordyId | ImportDotId) | ImportSymbolyId
  public static boolean ImportPrefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportPrefix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_PREFIX, "<import prefix>");
    r = ImportPrefix_0(b, l + 1);
    if (!r) r = ImportSymbolyId(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ImportWordyId | ImportDotId
  private static boolean ImportPrefix_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportPrefix_0")) return false;
    boolean r;
    r = ImportWordyId(b, l + 1);
    if (!r) r = ImportDotId(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ImportWordyId | ImportSymbolyId
  public static boolean ImportSuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportSuffix")) return false;
    if (!nextTokenIs(b, "<import suffix>", SYMBOLY, WORDY)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_SUFFIX, "<import suffix>");
    r = ImportWordyId(b, l + 1);
    if (!r) r = ImportSymbolyId(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // symboly
  public static boolean ImportSymbolyId(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportSymbolyId")) return false;
    if (!nextTokenIs(b, SYMBOLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOLY);
    exit_section_(b, m, IMPORT_SYMBOLY_ID, r);
    return r;
  }

  /* ********************************************************** */
  // wordy
  public static boolean ImportWordyId(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportWordyId")) return false;
    if (!nextTokenIs(b, WORDY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WORDY);
    exit_section_(b, m, IMPORT_WORDY_ID, r);
    return r;
  }

  /* ********************************************************** */
  // Import+
  public static boolean Imports(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Imports")) return false;
    if (!nextTokenIs(b, USE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Import(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!Import(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Imports", c)) break;
    }
    exit_section_(b, m, IMPORTS, r);
    return r;
  }

  /* ********************************************************** */
  // unique | structural | type | ability | where | match | with | cases | otherwise | true | false |
  //  lambda | include | signature | at_signature | inline_signature | at_typecheck | at_eval | evaluate | source | if |
  //   then | else | syntax_doc_untitled_section | syntax_doc_column | type_link | term_link | test_watch | watch | open |
  //    close | dot | comma | paren1 | paren2 | bracket1 | bracket2 | doc_open | doc_close | brace1 | brace2 | colon |
  //     forall1 | forall2 | equal | pipe | or | and | arrow | at | quote | exclamation_mark | back_quote |
  //      fold | plus | minus | mul | underscore | number | wordy | symboly
  public static boolean Reserved(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Reserved")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RESERVED, "<reserved>");
    r = consumeToken(b, UNIQUE);
    if (!r) r = consumeToken(b, STRUCTURAL);
    if (!r) r = consumeToken(b, TYPE);
    if (!r) r = consumeToken(b, ABILITY);
    if (!r) r = consumeToken(b, WHERE);
    if (!r) r = consumeToken(b, MATCH);
    if (!r) r = consumeToken(b, WITH);
    if (!r) r = consumeToken(b, CASES);
    if (!r) r = consumeToken(b, OTHERWISE);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, LAMBDA);
    if (!r) r = consumeToken(b, INCLUDE);
    if (!r) r = consumeToken(b, SIGNATURE);
    if (!r) r = consumeToken(b, AT_SIGNATURE);
    if (!r) r = consumeToken(b, INLINE_SIGNATURE);
    if (!r) r = consumeToken(b, AT_TYPECHECK);
    if (!r) r = consumeToken(b, AT_EVAL);
    if (!r) r = consumeToken(b, EVALUATE);
    if (!r) r = consumeToken(b, SOURCE);
    if (!r) r = consumeToken(b, IF);
    if (!r) r = consumeToken(b, THEN);
    if (!r) r = consumeToken(b, ELSE);
    if (!r) r = consumeToken(b, SYNTAX_DOC_UNTITLED_SECTION);
    if (!r) r = consumeToken(b, SYNTAX_DOC_COLUMN);
    if (!r) r = consumeToken(b, TYPE_LINK);
    if (!r) r = consumeToken(b, TERM_LINK);
    if (!r) r = consumeToken(b, TEST_WATCH);
    if (!r) r = consumeToken(b, WATCH);
    if (!r) r = consumeToken(b, OPEN);
    if (!r) r = consumeToken(b, CLOSE);
    if (!r) r = consumeToken(b, DOT);
    if (!r) r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, PAREN1);
    if (!r) r = consumeToken(b, PAREN2);
    if (!r) r = consumeToken(b, BRACKET1);
    if (!r) r = consumeToken(b, BRACKET2);
    if (!r) r = consumeToken(b, DOC_OPEN);
    if (!r) r = consumeToken(b, DOC_CLOSE);
    if (!r) r = consumeToken(b, BRACE1);
    if (!r) r = consumeToken(b, BRACE2);
    if (!r) r = consumeToken(b, COLON);
    if (!r) r = consumeToken(b, FORALL1);
    if (!r) r = consumeToken(b, FORALL2);
    if (!r) r = consumeToken(b, EQUAL);
    if (!r) r = consumeToken(b, PIPE);
    if (!r) r = consumeToken(b, OR);
    if (!r) r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, ARROW);
    if (!r) r = consumeToken(b, AT);
    if (!r) r = consumeToken(b, QUOTE);
    if (!r) r = consumeToken(b, EXCLAMATION_MARK);
    if (!r) r = consumeToken(b, BACK_QUOTE);
    if (!r) r = consumeToken(b, FOLD);
    if (!r) r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, MUL);
    if (!r) r = consumeToken(b, UNDERSCORE);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, WORDY);
    if (!r) r = consumeToken(b, SYMBOLY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // double_quote (string_span | string_escape_sequence)* double_quote
  public static boolean String(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "String")) return false;
    if (!nextTokenIs(b, DOUBLE_QUOTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOUBLE_QUOTE);
    r = r && String_1(b, l + 1);
    r = r && consumeToken(b, DOUBLE_QUOTE);
    exit_section_(b, m, STRING, r);
    return r;
  }

  // (string_span | string_escape_sequence)*
  private static boolean String_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "String_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!String_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "String_1", c)) break;
    }
    return true;
  }

  // string_span | string_escape_sequence
  private static boolean String_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "String_1_0")) return false;
    boolean r;
    r = consumeToken(b, STRING_SPAN);
    if (!r) r = consumeToken(b, STRING_ESCAPE_SEQUENCE);
    return r;
  }

}
