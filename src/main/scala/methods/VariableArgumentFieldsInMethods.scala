package methods

class VariableArgumentFieldsInMethods {
  def main(args: Array[String]): Unit = {
    printAll()
    printAll("foo")
    printAll("foo", "bar")
    printAll("foo", "bar", "baz")

    // a sequence of strings
    val fruits = List("apple", "banana", "cherry")

    // pass the sequence to the varargs field
    printAll(fruits: _*)


  }
  //                       .-------- @note: this to identify variable argument list or arguments of the same type
  //                       v
  def printAll(strings: String*) {
    strings.foreach(println)
  }
}
