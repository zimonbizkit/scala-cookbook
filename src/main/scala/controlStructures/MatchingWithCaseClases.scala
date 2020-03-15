package controlStructures

trait Animal
case class Dog(name: String) extends Animal
case class Cat(name: String) extends Animal
case object Woodpecker extends Animal

object MatchingWithCaseClases {
  def determineType(x: Animal): String = x match {
    case Dog(name) if name == "Rocky" => "WTF, Rocky, like the boxer!!!!!"
    case Dog(moniker) => "Got a Dog, name = " + moniker
    case _:Cat => "Got a Cat (ignoring the name)"
    case Woodpecker => "That was a Woodpecker"
    case _ => "That was something else"
  }

  def main(args: Array[String]): Unit = {
    println(determineType(Dog("Rocky")))
    println(determineType(Cat("Rusty the Cat")))
    println(determineType(Woodpecker))

    val x = "1" :: "2" :: "3" :: Nil
    println(listToString(x))
  }
  def listToString(list: List[String]): String = list match {
    case s :: rest => s + " " + listToString(rest)
    case Nil => ""
  }

}
