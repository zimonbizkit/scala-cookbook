package classesAndProperties

object OverridingAccessorsAndMutators {
  def main(args: Array[String]): Unit = {
    val p = new Person("Jonathan")
    p.name = "Jony"    // setter
    println(p.name)    // getter

  }
}
class Person(private var _name: String) {
  def name :String = _name                             // accessor
  def name_=(aName: String) { _name = aName }  // mutator
}
