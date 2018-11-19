package cn.gaohank.program.scala.base.base_06_class

/**
  * None是一个object，是Option的子类型
  * Some也是Option的子类
  * scala推荐在可能返回空的方法使用Option[X]作为返回类型
  * Null是所有AnyRef的子类, null是Null的唯一对象
  */
object NoneDemo {
    def main(args: Array[String]): Unit = {
        val list1: List[String] = null
        println(Option(list1))
    }
}
