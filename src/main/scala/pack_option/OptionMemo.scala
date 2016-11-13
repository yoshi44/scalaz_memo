package pack_option

object OptionMemo extends App{

  val x: Option[String] = Option("OptionTest")
  val y = x match {
    case Some(s) => "some value"
    case None => "none value"
  }
  println(s"y===${y}")

  // 
  import scalaz._
  import Scalaz._
  val x2: Option[String] = "OptionTest2".some
  val y2: String = {
    x2 some { 
      s:String => "some value"
    } none { 
      "none value" 
    }
  }
  println(s"y2===${y2}")

  // getOrElse sample
  val x3some: Option[String] = "OptionTest3".some
  val x3none: Option[String] = none
  println(s"x3some===${x3some.getOrElse("none test3")}")
  println(s"x3none===${x3none.getOrElse("none test3")}")
  
  val x41 = x3some | { "none test3" }
  val x42 = x3none | { "none test3" }

  println(s"x41===${x41}")
  println(s"x42===${x42}")

}

