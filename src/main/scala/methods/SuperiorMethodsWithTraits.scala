package methods

object SuperiorMethodsWithTraits {
  def main(args: Array[String]): Unit = {
    val c: Child  = new Child

    println(s"c.printSuper  = ${c.printSuper}")
    println(s"c.printMother = ${c.printMother}")
    println(s"c.printFather = ${c.printFather}")
    println(s"c.printHuman  = ${c.printHuman}")
  }
}

class Child extends Human with Mother with Father { // <---- @note: trait linearization and context
  def printSuper : String = super.hello             //       choice with the super[Blabla] capability
  def printMother : String = super[Mother].hello    //       is a tool to solve the "diamon problem"
  def printFather : String = super[Father].hello    //       inheritance problem
  def printHuman : String = super[Human].hello
}

trait Human {
  def hello = "the Human trait"
}

trait Mother extends Human {
  override def hello = "Mother"
}

trait Father extends Human {
  override def hello = "Father"
}
trait TraitedAnimal {
  def walk { println("Animal is walking") }
}

class FourLeggedAnimal extends TraitedAnimal {
  override def walk { println("I'm walking on all fours") }
}

//                                          .-------------------------- @NOTE: super[Animal].walk won't work if it
//                                          v                           weren't for this
class Dog extends FourLeggedAnimal with TraitedAnimal { //                       |
  def walkThenRun {               //                                              ----------------------
    super.walk                    // works                                                             |
    super[FourLeggedAnimal].walk  // works                                                             |
    super[TraitedAnimal].walk     // error: won't compile, unless we put the TraitedAnimal in it--------
  }
}



