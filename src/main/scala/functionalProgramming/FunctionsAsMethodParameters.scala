package functionalProgramming

object FunctionsAsMethodParameters {
  def main(args: Array[String]): Unit = {
    // below is a function inside a variable
    val sayHello = () => println("Hello")
    val strtoint = (s:String) => s.toInt

    //then we execute the function inside of it
    executeFunction(sayHello)
    println(
      executeSpecificSignatureFunction(strtoint)
    )
  }
  //@NOTE: Return values must match. this is no problem here as println returns Unit, which is like void in other
  // programming languages
  def executeFunction(callback:() => Unit) {
    callback()
  }

  def executeSpecificSignatureFunction(f:String => Int): Unit = {
    f
  }


}
