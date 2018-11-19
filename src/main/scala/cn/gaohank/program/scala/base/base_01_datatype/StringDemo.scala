package cn.gaohank.program.scala.base.base_01_datatype

object StringDemo {
    def main(args: Array[String]): Unit = {
        println("123".r)
        // 1
        println("123".head)
        // hank-bob
        println(List("hank", "bob").mkString("-"))
    }
}
