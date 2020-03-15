package numbers

import EduComparisonUtils._

object ComparingFloatNumbers {
  def main(args: Array[String]): Unit = {
    val a: Double = 0.3
    val b:Double = 0.1 + 0.2

    println(
      fc(a,b,0.00001)
    )

    //     .---------------------Nice thing that I achieved here
    //     v                     Thanks to EduComparisonUtils.FuzzyComparison.~= :D
    if (a ~= b) {
      println("Floats are similar in precision")
    }else{
      println("Numbers are not similar, but " +
        "I think now I understood function composition " +
        "!")
    }
  }

  def fc(x:Double,y:Double,precision:Double) :Boolean = {
    (x-y).abs < precision
  }
}

object EduComparisonUtils {
  implicit class FuzzyComparison(val s:Double) {
    implicit val precision :Double = 0.00000000001
    def ~=(x:Double):Boolean = {
      (x-s).abs > precision
    }
  }
}
