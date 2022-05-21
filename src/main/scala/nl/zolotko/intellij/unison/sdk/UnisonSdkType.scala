package nl.zolotko.intellij.unison.sdk

import com.intellij.openapi.fileChooser.FileChooserDescriptor
import com.intellij.openapi.project.Project
import com.intellij.openapi.projectRoots.*
import com.intellij.openapi.projectRoots.impl.SdkConfigurationUtil
import com.intellij.openapi.roots.OrderRootType
import com.intellij.openapi.util.SystemInfo
import com.intellij.openapi.vfs.VirtualFile
import nl.zolotko.intellij.unison.language.UnisonIcons
import org.jdom.Element

import java.io.File
import javax.swing.Icon

class UnisonSdkType extends SdkType("Unison Codebase Manager (UCM)") {

  override def suggestHomePath(): String =
    if (SystemInfo.isLinux)
      "/usr/local/bin/ucm"
    else if (SystemInfo.isMac)
      "/usr/local/bin/ucm"
    else if (SystemInfo.isWindows)
      s"${sys.env.get("APPDATA")}\\local\\bin\\ucm"
    else null

  override def suggestSdkName(currentSdkName: String, sdkHome: String): String =
    "Unison Codebase Manager (UCM)"

  override def createAdditionalDataConfigurable(
      sdkModel: SdkModel,
      sdkModificator: SdkModificator
  ): AdditionalDataConfigurable =
    null

  override def isValidSdkHome(path: String): Boolean =
    if (path.trim.isEmpty)
      false
    else {
      val unisonPath = new File(path)
      !unisonPath.isDirectory && unisonPath.getName.toLowerCase.contains("ucm") // && getNumericVersion(path).isDefined
    }

  override val getPresentableName: String = "Unison Codebase Manager (UCM)"

  override def saveAdditionalData(additionalData: SdkAdditionalData, additional: Element): Unit = ()

  override val getIcon: Icon = UnisonIcons.file

  override val getIconForAddAction: Icon = getIcon

  override def isRootTypeApplicable(`type`: OrderRootType): Boolean = false

  override def setupSdkPaths(sdk: Sdk): Unit = ()

  override def getVersionString(sdkHome: String): String =
    (
      if (isValidSdkHome(sdkHome))
        getNumericVersion(sdkHome)
      else
        None
    ).getOrElse("-")

  override def getHomeChooserDescriptor: FileChooserDescriptor = {
    val descriptor: FileChooserDescriptor = new FileChooserDescriptor(true, false, false, false, false, false) {
      override def validateSelectedFiles(files: Array[VirtualFile]): Unit =
        if (files.nonEmpty) {
          val selectedPath = new File(files(0).getPath).getAbsolutePath
          var pathValid    = isValidSdkHome(selectedPath)
          if (!pathValid) {
            pathValid = isValidSdkHome(adjustSelectedSdkHome(selectedPath))
            if (!pathValid) {
              val message = s"The selected file is not a valid $getPresentableName"
              throw new Exception(message)
            }
          }
        }
    }
    descriptor.setTitle(s"Select path to $getPresentableName")
    descriptor
  }

  private def getNumericVersion(ucmPath: String): Option[String] = None // TODO
}

object UnisonSdkType {
  def getInstance: UnisonSdkType = SdkType.findInstance(classOf[UnisonSdkType])

  def findOrCreateSdk(): Sdk =
    SdkConfigurationUtil.findOrCreateSdk(null, getInstance)
}
