package helloscala.basic

object HelloList {
  def main(args: Array[String]): Unit = {
    val list = List("1", "2", "3")
    list.foreach(s => {
      println(s"Hello: $s")
    })
  }
}
