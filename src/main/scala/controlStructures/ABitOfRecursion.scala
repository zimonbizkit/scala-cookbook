package controlStructures

import scala.annotation.tailrec

object ABitOfRecursion {
  def main(args: Array[String]): Unit = {

    println(
      factorial(5)
    )
    println(
      optimisedFactorial(5)
    )

    def factorial(n: Int): Int = {
      if (n == 1) 1
      else n * factorial(n - 1)
    }


    def optimisedFactorial(n: Int): Int = {

      // .-------------- this annotation would make a compilation error if the recursive callee
      // |               (factorialAcc) is not positioned as the last statement
      // v
      @tailrec def factorialAcc(acc: Int, n: Int): Int = {
        if (n <= 1) acc
        else factorialAcc(n * acc, n - 1)
      }
      factorialAcc(1, n)
    }
  }
}
