package functionalProgramming

object Closures {
  def main(args: Array[String]): Unit = {
    var hello :String = "hello"
    def sayHello(name:String): Unit =  println(s"$hello, $name")

    // execute sayHello from the exec method foo
    val foo = new otherscope.Foo
    foo.exec(sayHello, "Al")

    // change the local variable 'hello', then execute sayHello from
    // the exec method of foo
    hello = "Hola"
    foo.exec(sayHello, "Lorenzo")

    var votingAge = 18
    val isOfVotingAge = (age: Int) => age >= votingAge

    printResult(isOfVotingAge,20)
    printResult(isOfVotingAge,16)

    def printResult(f: Int => Boolean, x: Int) {
      println(f(x))
    }


  }




}
package otherscope {
  class Foo {
    // a method that takes a function and a string, and passes the string into
    // the function, and then executes the function

    def exec(f:(String) => Unit,name:String): Unit = {
      f(name)
    }
  }
}
