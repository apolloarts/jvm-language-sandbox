package helloscala.specific

import scala.annotation.tailrec

object HelloTailRecursion extends App {

  def recursiveLength(list: List[String]): Long = list match {
    case Nil => 0
    case head :: tail => 1 + recursiveLength(tail)
  }

  @tailrec
  def tailRecursiveLength(list: List[String], accumulator: Long): Long = list match {
    case Nil => accumulator
    case head :: tail => tailRecursiveLength(tail, accumulator + 1)
  }

  println(recursiveLength(List("one", "two", "three")))
  println(tailRecursiveLength(List("one", "two", "three"), 0L))
}
