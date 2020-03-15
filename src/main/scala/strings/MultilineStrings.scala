package strings

object MultilineStrings {
  def main(args: Array[String]): Unit = {
    val str =
      """
        |"blabla"
        |anotherblabla
      """.stripMargin

    println(str)
  }
}
