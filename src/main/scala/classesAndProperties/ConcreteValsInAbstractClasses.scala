package classesAndProperties

object ConcreteValsInAbstractClasses {
  def main(args: Array[String]): Unit = {
    println(new AKindOfDog)
  }
}
abstract class AKindOfAnimal {
  val greeting = "Hello"                // provide an initial value
  def sayHello { println(greeting) }
  def run
}

class AKindOfDog extends AKindOfAnimal {
  override val greeting = "Woof"        // override the value
  def run { println("Dog is running") }
}