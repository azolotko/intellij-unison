package nl.zolotko.intellij.unison.actions

import com.intellij.ide.actions.{CreateFileFromTemplateAction, CreateFileFromTemplateDialog}
import com.intellij.openapi.project.{DumbAware, Project}
import com.intellij.psi.PsiDirectory
import nl.zolotko.intellij.unison.UnisonBundle
import nl.zolotko.intellij.unison.language.UnisonIcons

class NewUnisonFileAction
    extends CreateFileFromTemplateAction(
      UnisonBundle.message("newfile.menu.action.text"),
      UnisonBundle.message("newfile.menu.action.description"),
      UnisonIcons.file
    )
    with DumbAware {
  override def getActionName(directory: PsiDirectory, newName: String, templateName: String): String =
    UnisonBundle.message("newfile.menu.action.text")

  override def buildDialog(
      project: Project,
      directory: PsiDirectory,
      builder: CreateFileFromTemplateDialog.Builder
  ): Unit =
    builder
      .setTitle(UnisonBundle.message("create.new.unison.file"))
      .addKind(UnisonBundle.message("newfile.menu.action.text"), UnisonIcons.file, "Unison Scratch File")
}
