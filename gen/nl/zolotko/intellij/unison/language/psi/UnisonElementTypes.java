// This is a generated file. Not intended for manual editing.
package nl.zolotko.intellij.unison.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import nl.zolotko.intellij.unison.language.psi.impl.*;

public interface UnisonElementTypes {

  IElementType IMPORT = new UnisonElementType("IMPORT");
  IElementType IMPORTS = new UnisonElementType("IMPORTS");
  IElementType IMPORT_DOT_ID = new UnisonElementType("IMPORT_DOT_ID");
  IElementType IMPORT_PREFIX = new UnisonElementType("IMPORT_PREFIX");
  IElementType IMPORT_SUFFIX = new UnisonElementType("IMPORT_SUFFIX");
  IElementType IMPORT_SYMBOLY_ID = new UnisonElementType("IMPORT_SYMBOLY_ID");
  IElementType IMPORT_WORDY_ID = new UnisonElementType("IMPORT_WORDY_ID");

  IElementType DOT = new UnisonTokenType("dot");
  IElementType SYMBOLY = new UnisonTokenType("symboly");
  IElementType USE = new UnisonTokenType("use");
  IElementType WORDY = new UnisonTokenType("wordy");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == IMPORT) {
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
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
