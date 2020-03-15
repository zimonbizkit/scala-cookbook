package functionalProgramming

object FunctionsReturningFunctions {
  def main(args: Array[String]): Unit = {
    println(
      sayHello("Edu")
    )

    println(
      buenosDias("Edu")
    )

    println(
      hello("englishname")
    )
  }
  val sayHello = saySomething("Hello")
  def saySomething(prefix: String) = (s: String) => {prefix + " " + s}


  val hello = greeting("english")
  val buenosDias = greeting("spanish")



  def greeting(language: String) = (name: String) => {
    val english = () => "Hello, " + name
    val spanish = () => "Buenos dias, " + name
    language match {
      case "english" => println("returning 'english' function")
        english()
      case "spanish" => println("returning 'spanish' function")
        spanish()
    }
  }
}
