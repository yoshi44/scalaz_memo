package pack_monoid


object MonoidMemo extends App{
  def sum(xs: List[Int]): Int = {
    xs.foldLeft(IntMonoid.mzero)(IntMonoid.mappend)
  }
  println(sum(List(1,2,3,4))) // 10
}

object IntMonoid {
  def mappend(a: Int, b: Int): Int = a + b
  def mzero: Int = 0
}
