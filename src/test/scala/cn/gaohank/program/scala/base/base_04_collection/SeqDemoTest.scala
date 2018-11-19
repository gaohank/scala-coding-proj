package cn.gaohank.program.scala.base.base_04_collection

import org.scalatest.FunSuite

class SeqDemoTest extends FunSuite {

    test("testGetSeq") {
        assert(SeqDemo.getSeq(Option.empty).isEmpty)
    }

}
