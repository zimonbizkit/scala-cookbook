package functionalProgramming

object MoreComplexFunctions {

  def main(args: Array[String]): Unit = {

    exec(plusOne)

    executeTimes(printAWord, 20)

    exec(
      {
        i: Int =>
          println(
            (i * 233) / 3.14153433463453 % 2
          )
      }
    )

    executeAndPrint(
      multiply,3,2
    )
  }

  val printAWord = () => println("test")
  val plusOne = (i: Int) => println(i + 1)
  val sum = (x:Int,y:Int) => x+y
  val multiply = (x:Int,y:Int) => x*y



  def exec(f: Int => Unit): Unit = {
    println(f(1))
  }

  def executeTimes(f: () => Unit, n: Int) : Unit = {
    for (i <- 1 to n) f()
  }

  def executeAndPrint(f:(Int, Int) => Int, x: Int, y: Int) {
    val result = f(x, y)
    println(result)
  }
}
