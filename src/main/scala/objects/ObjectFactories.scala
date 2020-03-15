package objects

object ObjectFactories {
  def main(args: Array[String]): Unit = {
    Seq(
      AnimalObject("cat"),
      AnimalObject("dog"),
      AnimalObject      // <----- this returns an animalobject but of no type, superstrange, will ask why
    ).foreach(println)
  }
}

object AnimalObject {
  private class Dog extends AnimalTrait{
    override def speak: Unit = println("woof")
    override def toString: String = "this is a dog"
  }

  private class Cat extends AnimalTrait{
    override def speak: Unit = println("meow")
    override def toString: String = "this is a cat"
  }

  def apply(s:String): AnimalTrait = {
    s match {
      case "dog" => new Dog
      case "cat" => new Cat
    }
  }
}

trait AnimalTrait {
  def speak
  override def toString: String
}
