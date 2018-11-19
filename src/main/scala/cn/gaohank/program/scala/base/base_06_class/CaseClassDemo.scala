package cn.gaohank.program.scala.base.base_06_class

/**
  * case class不是普通的类
  * 而是专门做样例匹配的类
  */
case class Register(username : String, password : String)
case class Login(username : String, password : String)

object CaseClassDemo {

}
