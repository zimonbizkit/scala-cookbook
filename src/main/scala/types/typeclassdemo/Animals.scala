package types.typeclassdemo

// an existing, closed model
trait TDAnimal
final case class Dog(name: String) extends TDAnimal
final case class Cat(name: String) extends TDAnimal

