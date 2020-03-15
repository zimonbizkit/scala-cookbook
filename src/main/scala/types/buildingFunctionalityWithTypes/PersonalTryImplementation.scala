package types.buildingFunctionalityWithTypes

object PersonalTryImplementation {
  def main(args: Array[String]): Unit = {
    val x = Attempt("10".toInt)   // Succeeded(10)
    val y = Attempt("10A".toInt)  // Failed(Exception)
    val result = y.getOrElse(0)

    println(x)
    println(y)
    println(result)


  }
}
