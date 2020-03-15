package strings

object PatternsInStrings {
  def main(args: Array[String]): Unit = {
    val numPattern  = "[0-9]+".r
    val wrongPattern  = "potato+".r
    val str = "123 Main street Suite 101"
    println(
      numPattern.findFirstIn(str).getOrElse("NotFound")
    )
    println(
      numPattern.findAllIn(str).mkString(" \n ")
    )

    numPattern.findAllIn(str).foreach(println)
    println(
      wrongPattern.findFirstIn(str).getOrElse("NotFound!")
    )
  }
}
