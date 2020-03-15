package types

object AddingBehaviourToAClosedModel {
  def main(args: Array[String]): Unit = {
    println(add(1, 1))
    println(add(1.0, 1.5))
    println(add(1, 1.5F))
  }
  def add[A](x: A, y: A)(implicit numeric: Numeric[A]): A = numeric.plus(x, y)

}

