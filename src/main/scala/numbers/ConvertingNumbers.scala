package numbers

object ConvertingNumbers {
  def main(args: Array[String]): Unit = {
    println(12.toFloat)
    println(19.234234.toInt)

    println(1000L.isValidByte)

    // also you can override numbers like below

    // @NOTE: always dobule, why?
    // seemingly because when doing a Seq, the compiler asserts the type of the
    // first element, and transparently casts all the subsequent elements to that type
    Seq(1f,1f,1000L,2343).foreach(
      s=> println(s.getClass)
    )

    // why would I want a Seq of different elements?

    // annotating type is ok
    val a: Short = 3
    println(
      a.getClass
    )

    // type ascription shown below, should be useful when marshalling json objects for example
    val s : String = "Hi"

    val o  = s:Object

  }
}
