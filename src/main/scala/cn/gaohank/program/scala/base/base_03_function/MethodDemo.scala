package cn.gaohank.program.scala.base.base_03_function

object MethodDemo {
    def concat(a: String, b: String): String = a + b

    def main(args: Array[String]): Unit = {
        def m(a: Int, b: Int): Int = a + b
        val f = (a: Int, b: Int) => a * b
        println(m(f(1, 2), f(3, 4)))

        println(concat("gao", "hank"))
    }
}
