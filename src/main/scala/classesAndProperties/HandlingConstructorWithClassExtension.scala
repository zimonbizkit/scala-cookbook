package classesAndProperties

object HandlingConstructorWithClassExtension {
  def main(args: Array[String]): Unit = {
    val teresa = new Employee("Teresa", TheAddress("Louisville", "KY"), 25)

    println(teresa.toString) // <--- the tostring method is retrieved from BasePerson, and not Employeee

  }
}

class BasePerson (var name: String, var address: TheAddress) {
  override def toString = if (address == null) name else s"$name @ $address"
}
class Employee (name: String, address: TheAddress, var age: Int)
  extends BasePerson (name, address) {
  // rest of the class
}

case class TheAddress (city: String, state: String)

