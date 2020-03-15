package functionalProgramming

object FunctionsAsVariables {
  def main(args: Array[String]): Unit = {
    // here we are assigning a function to a variable , which will take an Int (i as an argument), and will return a
    // function as indicated in "()" , that acts as a function type
    val double : Int => Int = i => { i * 2 }
    //  ¨¨¨|¨¨   ¨|¨    ¨|¨
    //     |      |      |
    // function   |      |
    //      that expects |
    //             and returns an
    println(double(2))
    println(double(4))
    println(double(6))

    val list = List.range(1,100)

    //                 .------- @NOTE: cool thing is that you can pass functions in variables to methods that expect
    //               __|___     a function, for code tidyness
    println(list.map(double))

    println(
      (1 to 100).map(double)
    )


    // implicit approach (shorter one)
    val add = (x: Int, y: Int) => { x + y }
    val add2 = (x: Int, y: Int) => x + y

    // and explicit approach of defining parameters (longer one)
    val add3: (Int, Int) => Int = (x,y) => { x + y }
    val add4: (Int, Int) => Int = (x,y) => x + y

    //                                .---- you can pass methods too as arguments to functions that require a function
    println( //                       |     as an argument
      List.range(1, 10).filter(modMethod)
    )

  }

  def modMethod(i: Int): Boolean = i % 2 == 0
}
