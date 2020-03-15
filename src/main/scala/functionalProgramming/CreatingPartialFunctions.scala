package functionalProgramming

object CreatingPartialFunctions {
  def main(args: Array[String]): Unit = {

    val handle1to10 = convert1to5 orElse convert6to10  // nice function composition over here!
                                                       // @NOTE: I would like this to build a ChainOfResponsibility p
    println(handle1to10(3))                            // pattern
    println(handle1to10(7))

    println(
      (1 to 5) collect isEven                          // <-- nice syntax over here also, passing the function without
    )                                                  // any specific character

  }

  val isEven: PartialFunction[Int,String] = {
    case x if x % 2 == 0 => x + "is even"
  }

  val convert1to5 = new PartialFunction[Int, String] {
    val nums = Array("one", "two", "three", "four", "five")
    def apply(i: Int) = nums(i-1)
    def isDefinedAt(i: Int) = i > 0 && i < 6
  }

  // converts 6 to "six", etc., up to 10
  val convert6to10 = new PartialFunction[Int, String] {
    val nums = Array("six", "seven", "eight", "nine", "ten")
    def apply(i: Int) = nums(i-6)
    def isDefinedAt(i: Int) = i > 5 && i < 11
  }



}
