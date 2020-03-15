package numbers

object ParsingNumbers {
  def main(args: Array[String]): Unit = {
    println("100".toDouble)
    println("100".toFloat)
    println("100".toLong)
    println("100".toShort)
    println("100".toByte)

    try{
      println("hello".toLong)
    }catch {
      case e: Exception => println("the conversion could not be done properly: " + e.getMessage)
    }

    // you can transform the base of the number you are treating
    println(Integer.parseInt("100",2))

    // also we can do it via an implicit conversion, like below:
    implicit class StringToInt(s:String) {
    @throws(classOf[NumberFormatException]) // <---- scala knows which exception to throw if a
      //                                             bad conversion happens, putting it here
      //                                             just as a reminder
      def toInt(radix: Int): Option[Int] = {
        try {
          Some(
            Integer.parseInt(s,radix)
          )
        } catch {
          case e: NumberFormatException => None
        }
      }
    }

    //@NOTE: below just returns the some on the first case, will need to check

    Seq("100","199","hello").foreach(
      s => println(
        s.toInt(2)
      )
    )

    println("938493".toInt(20).getOrElse(0))
    println("Edu guapetón".toInt(2).getOrElse(0))

    //@NOTE: Can't be "implicit conversions" or implicit implementations a way to enable Demeters Law?
  }
}
