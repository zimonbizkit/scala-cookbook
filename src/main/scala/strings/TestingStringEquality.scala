package strings

object TestingStringEquality {
  def main(args: Array[String]): Unit = {
    val s1 ="Hello"
    val s2 ="Hello"
    val s3 ="Hell" + "o"
    val s4 : String = null
    val s5 = "hello"
    assert(s1 == s2)
    assert(s1 == s3)
    assert(s1.toUpperCase() == s2.toUpperCase())
    assert(s1.equalsIgnoreCase(s5))
    //assert(s1 == s4, "null does not equal to string")
  }
}
