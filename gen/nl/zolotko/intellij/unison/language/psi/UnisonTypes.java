// This is a generated file. Not intended for manual editing.
package nl.zolotko.intellij.unison.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;

public interface UnisonTypes {
  IElementType CRLF = new UnisonTokenType("CRLF");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
