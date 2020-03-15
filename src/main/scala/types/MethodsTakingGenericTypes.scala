package types

object MethodsTakingGenericTypes {
  def main(args: Array[String]): Unit = {
    println(randomElement(Seq(1,2,3,4)))
    println(randomElement(Seq("one","two","three")))
    println(randomElement(Seq(2.1,4234.24,96,5,66)))
    println(randomElement(Vector.range('a','z')))
  }
  def randomElement[A](seq: Seq[A]): A = {
    val randomNum = util.Random.nextInt(seq.length)
    seq(randomNum)
  }

}
