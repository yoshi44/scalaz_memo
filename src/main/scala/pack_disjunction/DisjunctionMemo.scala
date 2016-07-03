package pack_disjunction

import scalaz.{Scalaz, \/, \/-}
import Scalaz._

object DisjunctionMemo extends App{

  val a: Int \/ String = \/-("foo")
  println(s"a===${a}") // \/-(foo)

  val b: \/[Int, String] = a
  println(s"b===${b}") // \/-(foo)

  val c:Int \/ String = \/.right("foo")
  println(s"c===${c}") // \/-(foo)

  val d = a.map(_ + "bar")
  println(s"d===${d}") // \/-(foobar)

  val e: Int \/ String = \/.left(42)
  println(s"e===${e}") // -\/(42)

  val f = e.map(_ + "bar")
  println(s"f===${f}") // -\/(42)

  val g = e.leftMap(_ * 100)
  println(s"g===${g}") // -\/(4200)

  // ee design
  println(1.right[String].isRight) // true
  println(1.right[String].isLeft) // false
  println(1.right[String] | 0) // 1
}
