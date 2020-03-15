package strings

object StringLiterals {
  def main(args: Array[String]): Unit = {
    val name: String ="Joe"
    val age: Int = 44
    val pet: Animal = Dog

    println(
      s"$name is $age years old \n and has a ${pet.getClass.toString.split("\\.").last}"
    )

    println(
      raw"$name is $age years old \n an has a ${pet.getClass.toString.split("\\.").last}"
    )

    println(
      supa"Edu is a developer"
    )
  }

  implicit class SupaInterpolator(val sc: StringContext) extends AnyVal {
    def supa(args: Any*): String = {
      sc.parts(0).split(" ").map(s => s"SUPAHOT $s").mkString(" ")
    }
  }
}

trait Animal

case object Dog extends Animal
case object Cat extends Animal
case object Horse extends Animal

