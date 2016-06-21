package pack_identity
import scalaz._
import Scalaz._

object Equal extends App{

  if (1 === 1) {
    println("number equal true")
  }
  if ("1" === "1") {
    println("string equal true")
  }

  1 assert_=== 1
  "1" assert_=== "1"
  true assert_=== true
  false assert_=== false
}
