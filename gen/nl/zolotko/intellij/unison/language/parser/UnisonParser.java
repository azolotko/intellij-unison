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
  // Imports
  static boolean File(PsiBuilder b, int l) {
    return Imports(b, l + 1);
  }

  /* ********************************************************** */
  // use ImportPrefix ImportSuffix*
  public static boolean Import(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Import")) return false;
    if (!nextTokenIs(b, USE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USE);
    r = r && ImportPrefix(b, l + 1);
    r = r && Import_2(b, l + 1);
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
  // Import*
  public static boolean Imports(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Imports")) return false;
    Marker m = enter_section_(b, l, _NONE_, IMPORTS, "<imports>");
    while (true) {
      int c = current_position_(b);
      if (!Import(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Imports", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

}
