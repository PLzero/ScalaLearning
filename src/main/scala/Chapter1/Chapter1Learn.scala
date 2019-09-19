package Chapter1

object Chapter1Learn{


  /**
   * 基础
   * 基本类型：
   * Byte
   * Char
   * Short
   * Int
   * Long
   * Float
   * Double
   * Booean
   *
   * @param args
   */

  def main(args: Array[String]): Unit = {
    val values = "0Hello World!"

    println(values.apply(1))
    println(values(1))
    println(values.asInstanceOf[String])
    println(values(0).asInstanceOf[Int]-48)

  }
}
