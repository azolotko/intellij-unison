// This is a generated file. Not intended for manual editing.
package nl.zolotko.intellij.unison.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static nl.zolotko.intellij.unison.language.psi.UnisonElementTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.zolotko.intellij.unison.language.psi.*;

public class UnisonImportPrefixImpl extends ASTWrapperPsiElement implements UnisonImportPrefix {

  public UnisonImportPrefixImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull UnisonVisitor visitor) {
    visitor.visitImportPrefix(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof UnisonVisitor) accept((UnisonVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public UnisonImportDotId getImportDotId() {
    return findChildByClass(UnisonImportDotId.class);
  }

  @Override
  @Nullable
  public UnisonImportSymbolyId getImportSymbolyId() {
    return findChildByClass(UnisonImportSymbolyId.class);
  }

  @Override
  @Nullable
  public UnisonImportWordyId getImportWordyId() {
    return findChildByClass(UnisonImportWordyId.class);
  }

}
