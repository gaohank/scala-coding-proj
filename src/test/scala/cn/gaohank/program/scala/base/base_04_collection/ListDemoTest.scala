package cn.gaohank.program.scala.base.base_04_collection

import org.scalatest.FunSuite

class ListDemoTest extends FunSuite {
    test("test List") {
        val fields = "name,,category".split(",").toList
        assert(fields(1) === "")
        assert(Option(fields(1).split(",")).filter(v => v.equals("movies")) === Option.empty)
    }
}
