package pack_applicative
import scalaz._
import Scalaz._
object ApplicativeMemo extends App {
  val some9 = 9.some
  val some3 = 3.some
  val total1 = some9 <* some3
  println(s"total1===${total1}") // Some(9)

  val total2 = (some9 |@| some3)(_ + _)
  println(s"total2===${total2}") // Some(12)
}
