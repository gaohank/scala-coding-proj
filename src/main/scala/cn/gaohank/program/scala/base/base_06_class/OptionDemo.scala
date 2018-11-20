package cn.gaohank.program.scala.base.base_06_class

object OptionDemo {
    def main(args: Array[String]): Unit = {
        // true
        println(Option("\"action\":\"query\"").exists(_.contains("query")))

        val test: Option[String] = None
        val str = test.map(v => v).map(v => v + "123").getOrElse("hellowrod")
        // helloworld
        println(str)
    }
}
