package controlStructures

import scala.annotation.tailrec
import Whilst._

object CustomControlStructures {
  def main(args: Array[String]): Unit = {
    var i = 0
    whilst (i < 5) {
      println(i)
      doubleif(i<1)(i<3){ // <--- passing a third type of argument as a code block (println)
        println("ohohohoho")
      }
      i += 1
    }


  }
}
object Whilst {
  @tailrec
  def whilst(testCondition: => Boolean)(codeBlock: => Unit) {
    if (testCondition) {
      codeBlock
      whilst(testCondition)(codeBlock)
    }
  }

  def doubleif(test1: => Boolean)(test2: => Boolean)(codeBlock: => Unit) {
    if (test1 && test2) {
      codeBlock
    }
  }



}

