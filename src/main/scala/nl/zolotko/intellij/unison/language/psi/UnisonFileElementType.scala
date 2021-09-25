package nl.zolotko.intellij.unison.language.psi

import com.intellij.psi.stubs.*
import com.intellij.psi.tree.IStubFileElementType
import com.intellij.psi.{PsiElement, PsiFile, StubBuilder}
import nl.zolotko.intellij.unison.language.{UnisonFile, UnisonLanguage}

object UnisonFileElementType extends IStubFileElementType[UnisonFileElementType.UnisonFileStub](UnisonLanguage) {
  type UnisonFileStub = PsiFileStubImpl[UnisonFile]

  override def indexStub(stub: UnisonFileStub, sink: IndexSink): Unit = ()

  override def getBuilder: StubBuilder = new DefaultStubBuilder() {
    override protected def createStubForFile(file: PsiFile): StubElement[_ <: PsiElement] =
      file match {
        case f: UnisonFile => new UnisonFileStub(f)
        case _             => super.createStubForFile(file)
      }
  }

  override val getStubVersion: Int = 1

  override def deserialize(dataStream: StubInputStream, parentStub: StubElement[_ <: PsiElement]): UnisonFileStub =
    new UnisonFileStub(null)

  override val getExternalId: String = "unison.file"
}
