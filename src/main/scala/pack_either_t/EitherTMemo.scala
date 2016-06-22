package pack_either_t
import scalaz._
import Scalaz._

object EitherTMemo extends App{

  // from EitherT.scala source
  val x: Option[String \/ Int] = Some(\/-(1))
  println(EitherT(x).map(1+).run) // Some(\/-(2))

  val x2: Option[String \/ Int] = Some(\/-(111))
  println(EitherT(x2).map(3+).run) // Some(\/-(114))

}
