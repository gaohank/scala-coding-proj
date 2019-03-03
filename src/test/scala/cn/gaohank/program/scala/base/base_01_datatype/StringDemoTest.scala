package cn.gaohank.program.scala.base.base_01_datatype

import org.scalatest.FunSuite

class StringDemoTest extends FunSuite {

    test("test String") {
        val name: String = null
        assert(Option(name) === Option.empty)
    }

    test("test String to List") {
        val actors = List("bob", "andy", "hank")
        val casts = actors.mkString(",")
        assert(casts.equals("bob,andy,hank"))
    }

}
