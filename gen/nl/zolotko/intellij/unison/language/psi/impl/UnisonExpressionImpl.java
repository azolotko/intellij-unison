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

public class UnisonExpressionImpl extends ASTWrapperPsiElement implements UnisonExpression {

  public UnisonExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull UnisonVisitor visitor) {
    visitor.visitExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof UnisonVisitor) accept((UnisonVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public UnisonImport getImport() {
    return findChildByClass(UnisonImport.class);
  }

  @Override
  @Nullable
  public UnisonReserved getReserved() {
    return findChildByClass(UnisonReserved.class);
  }

  @Override
  @Nullable
  public PsiElement getNewline() {
    return findChildByType(NEWLINE);
  }

  @Override
  @Nullable
  public PsiElement getString() {
    return findChildByType(STRING);
  }

}
