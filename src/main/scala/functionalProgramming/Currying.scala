package functionalProgramming

object Currying {
  def main(args: Array[String]): Unit = {
    // @NOTE: Currying is just having a function or a part of a function assigned to a value so that it can be
    // joined with other functions to have a final result. It is commonly known as a "partially applied function".

    val c = scala.math.cos _ //<-- this is the keyword to reassign the composition of a function to a new value

    println(c(10))

    val p = scala.math.pow(_, _) // this is just aliasing , in fact, wouldn't make much sense other than that
    p(scala.math.E,2)

    // below is an example of partial function application using currying
    //                                                           ¨¨¨¨|¨¨¨
    //                                     v-------------------------| <- here , we indicate that we'll compose the args
    val hello = saySomethingNice(sayHello) _ //                      | further on (hello)
    val printEduNicely = capitalizeString _ //                  |
     //
    val f = printEduNicely compose hello
    println(f("edu"))
    //              |
    //                     ^-----------------------------------------. <- and here we put the final argument in it
    //                                                  by calling it as a variable function

    // @NOTE: Currying would be interesting to do function composition in a more idiomatic way, like when building
    // complex computations where each step needs to have some context provided in it

  }

  def sayHello : String = "Hello,"
  def capitalizeString(s:String) : String = s.capitalize + "!"

  def saySomethingNice(a:String)(b:String): String = a + " " + b + " I hope you are having a nice day!"
}
