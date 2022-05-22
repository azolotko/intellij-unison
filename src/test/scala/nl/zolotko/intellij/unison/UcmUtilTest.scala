package nl.zolotko.intellij.unison

class UcmUtilTest extends munit.FunSuite {
  import UcmUtil.*

  test("extractVersion") {
    val obtained = extractVersion("ucm version: release/M3 (built on 2022-03-08)")
    val expected = Some("release/M3 (built on 2022-03-08)")
    assertEquals(obtained, expected)
  }

}
