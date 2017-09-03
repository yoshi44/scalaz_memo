package pack_monoid

import scalaz._
import Scalaz._

object MonoidMemo extends App{
  def sum(xs: List[Int]): Int = {
    xs.foldLeft(IntMonoid.mzero)(IntMonoid.mappend)
  }
  println(sum(List(1,2,3,4))) // 10

  val list = List(1,2,3,4)
  println(s"The sum is ${list.foldMap(identity)}") // 10

  println(list.foldMap(Tags.Multiplication.apply)) // 24

  println(List(true, true, true, true).foldMap(Tags.Disjunction.apply))     // true
  println(List(false, true, true, true).foldMap(Tags.Disjunction.apply))    // true
  println(List(false, false, true, true).foldMap(Tags.Disjunction.apply))   // true
  println(List(false, false, false, true).foldMap(Tags.Disjunction.apply))  // true
  println(List(false, false, false, false).foldMap(Tags.Disjunction.apply)) // false

  println(List("Hello", " World").foldMap(identity)) // Hello World

}

object IntMonoid {
  def mappend(a: Int, b: Int): Int = a + b
  def mzero: Int = 0
}
