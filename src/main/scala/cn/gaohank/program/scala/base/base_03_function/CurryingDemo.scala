package cn.gaohank.program.scala.base.base_03_function

/**
  * Currying
  */
object CurryingDemo {
    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3, 4)
        // 15
        println(list.foldLeft(5)(_ + _))
    }
}
