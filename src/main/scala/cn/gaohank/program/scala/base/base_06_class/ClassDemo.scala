package cn.gaohank.program.scala.base.base_06_class

class ClassDemo {
}

object ClassDemo {
    def apply():Unit = {
        println("apply方法已经被调用")
    }

    // 放到伴生对象中，相当于静态方法
    def apply(name:String):Unit = {
        println(name)
    }

    def main(args: Array[String]): Unit = {
        val h = ClassDemo
        println(h)
        h.apply()
        val a = ClassDemo
        println(a)
        val b = new ClassDemo
        println(b)
        ClassDemo("HelloWorld")
        ClassDemo()
    }
}
