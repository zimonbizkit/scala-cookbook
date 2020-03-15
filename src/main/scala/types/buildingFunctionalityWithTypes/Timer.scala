package types.buildingFunctionalityWithTypes

object Timer {
  def main(args: Array[String]): Unit = {
    val (result, time) = timer{
      // think about what to implement here that should take some seconds
    }
    println(s"result: $result, time: $time")

  }

  // @NOTE: The thing here is that we are building functionality equalling the first parameter of the function "timer"
  // to a generic, as we really don't care the type of what's passed here

  // @NOTE 2: The argument list which is "(blockOfCode: => A)" also works specifying the "transform" operator in the
  // parameter list, like "(blockOfCode: A)", but the result is different. Should investigate why.
  //                         |
  //           ______________v__
  def timer[A](blockOfCode:  A)  = {
    val startTime = System.nanoTime
    val result = blockOfCode
    val stopTime = System.nanoTime
    val delta = stopTime - startTime
    (result, delta/1000000d)
  }

  // @NOTE 3: Answering myself -> the "=>" modifier is used when we want a parameter to be "called-by-name".
  // Called-by-name parameters have the advantage that they are not evaluated until they are used (therefore
  // they have N evaluations per N usages)m and are different from "called-by-value" parameters, which are just evaluated
  // once, apparently at compilation times. delay evaluation of a parameter until it is used can help performance
  // if the parameter is computationally intensive to evaluate or a longer-running block of code such as fetching a URL.

}
