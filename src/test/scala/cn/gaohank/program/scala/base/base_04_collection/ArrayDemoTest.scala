package cn.gaohank.program.scala.base.base_04_collection

import org.scalatest.FunSuite

class ArrayDemoTest extends FunSuite {
    test("test Array") {
        val Array(name, category, casts) = Array("girl", "movie", "andy,bob")
        assert(category === "movie")
    }
}
