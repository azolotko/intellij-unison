// This is a generated file. Not intended for manual editing.
package nl.zolotko.intellij.unison.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface UnisonImport extends PsiElement {

  @NotNull
  UnisonImportPrefix getImportPrefix();

  @NotNull
  List<UnisonImportSuffix> getImportSuffixList();

  @NotNull
  PsiElement getNewline();

}
