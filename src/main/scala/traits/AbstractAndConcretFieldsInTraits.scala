package traits

object AbstractAndConcretFieldsInTraits {
  def main(args: Array[String]): Unit = {
    println((new Pizza).numToppings)
    println((new Pizza).size)
    println((new Pizza).maxNumToppings)
  }
}
trait PizzaTrait {
  var numToppings: Int     // abstract
  var size = 14            // concrete
  val maxNumToppings = 10  // concrete
}
class Pizza extends PizzaTrait {
  var numToppings = 0      // 'override' not needed
  size = 16                // 'var' and 'override' not needed
}

