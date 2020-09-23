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
    val str = "A,B,C,A,A,D,C,B"

    val line =  str.split(",") //分割

    val map_line = line.map(e=>(e,1)) // k => k,value

    val group_line =  map_line.groupBy(e=>e._1) // 按Key分组 map_line.groupBy(_._1)

    val result = group_line.map(e=>(e._1,e._2.size))

    result.foreach(println)

    val listLine = List("A B C","B C D","E C D","A C E")
    val test =
    listLine.flatMap(_.split(" "))
      .map(_.trim)
      .map((_,1))
      .groupBy(_._1)
      .map(e=>(e._1,e._2.size))


  }
}
