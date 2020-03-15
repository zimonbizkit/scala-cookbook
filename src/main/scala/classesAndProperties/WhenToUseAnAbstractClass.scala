package classesAndProperties

object WhenToUseAnAbstractClass {
  def main(args: Array[String]): Unit = {
    val dog = new ADog("Fido")
    val cat = new ACat("Morris")

    dog.sayHello
    cat.sayHello

    println(dog)
    println(cat)

    // verify that the age can be changed
    cat.age = 10
    println(cat)
  }
}

// Basically we "should" use an abstract class for base behaviour that needs parameters as arguments
// @NOTE: I think I digress with this, but ok

abstract class Pet (name: String) {
  val greeting: String
  var age: Int
  def sayHello { println(greeting) }
  override def toString = s"I say $greeting, and I'm $age"
}

class ADog (name: String) extends Pet (name) {
  val greeting = "Woof"
  var age = 2
}

class ACat (name: String) extends Pet (name) {
  val greeting = "Meow"
  var age = 5
}
