package com.stu1

import java.text.DateFormat._
import java.util.{Date, Locale}

import scala.util.matching.Regex.Match

object FunctionDemo {


  def debug(name:String):Unit = println("----- "+name+" 方法正在被执行"+"-----")

  def add(x:Int,y:Int):Int=x+y

  val add1 = (x:Int,y:Int,z:Int)  => x+y+z  //函数

  val add2 = add _  //告诉scala 把add 当做一个函数而不是通过调用那个方法来使用产生的值



  //变长参数
  def echo(args: String*): Unit = {
    debug("echo")
    for (arg <- args) println(arg)
    for (single <- 0 to args.length-1) print(args(single)+" ")
    println()
  }



  def getTime():Unit={
    debug("getTime")
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)

    /**
      * 单参数 有种简化写法：
      * 把方法名当做一种操作符，使用对象 方法名 参数中间以空格分隔的方式:object method parameter
      */
    println(df format now)
    println(df.format(now))

    //    val a = 10
    //    val b = 5
    //    val = a + b  同样的这个操作可以看做为一次名字为“＋”方法的调用 a.+(b)

  }


  def getInstantsParms():Unit={
    debug("getInstantsParms")
    /**
      * 都是通过静态工厂方法创建的 但 Scala 没有静态
      * 是以单例对象为工厂使用
      */
    val arr = Array(1,2,3,4)
    val list = List("One","Two","Three")
    val map = Map("a" -> "1","b" -> "2")
    println(map.get("a"))
  }

  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

  // 删除注释
  // 测试

  def main(args: Array[String]): Unit = {
    println(add(1,3))
    echo("a","b","c")

    /*echo 函数里被声明为类型“String*” 的 args 的类型实际上是 Array[String]。然而, 不能直接以数组做为入参，
    *需要在数组参数后添加一个冒号和一个_*符号,像这样:
    */
    val arr = Array("What's", "your", "name?")
    echo(arr: _*)

    getTime()


    getInstantsParms()

    println(add1(1,2,3))
    println(add2(2,2))
  }


}
