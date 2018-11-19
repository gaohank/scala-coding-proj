package cn.gaohank.program.scala.base.base_01_datatype

import org.scalatest.FunSuite

class TupleDemoTest extends FunSuite {
    test("test tuple") {
        val tuple = (1, 2, 3, 4)
        assert(1 === tuple._1)
    }
}
