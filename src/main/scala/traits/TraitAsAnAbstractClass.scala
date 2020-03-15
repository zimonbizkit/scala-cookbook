package traits

object TraitAsAnAbstractClass {
  def main(args: Array[String]): Unit = {
    println((new Dog).speak)
    println((new Cat).speak)
    println((new Dog).comeToMaster)
    println((new Cat).comeToMaster)
  }
}

trait Pet {
  def speak :String = "Yo"   // concrete implementation
  def comeToMaster :String             // abstract method
}

class Dog extends Pet {
  // don't need to implement 'speak' if you don't need to
  def comeToMaster : String =  "I'm coming!"
}

class Cat extends Pet {
  // override the speak method
  override def speak : String = "meow"
  def comeToMaster : String = "That's not gonna happen."
}