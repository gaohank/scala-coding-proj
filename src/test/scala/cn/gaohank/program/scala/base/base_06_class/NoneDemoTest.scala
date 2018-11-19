package cn.gaohank.program.scala.base.base_06_class

import org.scalatest.FunSuite

class NoneDemoTest extends FunSuite {
    test("test Option none") {
        val list: List[String] = null
        assert(None === Option(list))
        assert(Some(List(1, 2, 3)) === Option(List(1, 2, 3)))
    }
}
