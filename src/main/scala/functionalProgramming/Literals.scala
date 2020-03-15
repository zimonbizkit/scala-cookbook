package functionalProgramming

object Literals {
  def main(args: Array[String]): Unit = {
    val x = List.range(1, 10)
    //                           .--- this part over here is a function literal
    //                           |
    //                    _______|_____________
    val evens = x.filter((i: Int) => i % 2 == 0)
    //                           ¨¨¨--- this expression over here is called a "transformer".
    //                                  it helps understanding the placeholder on the left, and the function on the right
    //                         _____ you can wrap the literals between brackets too
    val multipleOf3 = x.filter {
      _ % 3 == 0 // no transformer here as we are using the "_" wildcard here
    }

  }
}
