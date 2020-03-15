package types

object ImmutableCollectionsCovariant {
/*
class List[+T]      <-- collections accepting covariance
class Vector[+A]
trait Seq[+A]
*/

  def main(args: Array[String]): Unit = {
    val dogs = Seq(new IDog("Fido"), new IDog("Tanner"))
    makeDogsSpeak(dogs)
    val superDogs = Seq(new ISuperDog("Wonder Dog"), new ISuperDog("Scooby"))
    makeDogsSpeak(superDogs)
  }
def makeDogsSpeak(dogs: Seq[IDog]) {
  dogs.foreach(_.speak)
}
}
class IDog(var name: String) extends Animal {
  def speak { println("Dog says woof") }
}

class ISuperDog(name: String) extends IDog(name) {
  override def speak { println("I'm a SuperDog") }
}
