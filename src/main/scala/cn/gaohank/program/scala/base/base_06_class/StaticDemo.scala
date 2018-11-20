package cn.gaohank.program.scala.base.base_06_class

class StaticDemo {
    def dosomething(): Unit = println(StaticDemo.num)
}

object StaticDemo {
    val num =10000
    def apply(str:String):Unit = println(str)
    // 静态方法，可以直接调用
    def printvar(): Unit = println("hello")

    def main(args: Array[String]): Unit = {
        // hello
        StaticDemo.printvar()
        val s = new StaticDemo()
        s.dosomething()
        StaticDemo("helloworld")
    }
}
