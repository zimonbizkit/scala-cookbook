package methods

object FluentInterfaceExample {
  def main(args: Array[String]): Unit = {
    val employee = new Employee

    // use the fluent methods. this is sth that can e achieved also in php so idk why I'm doing this
    employee.setFirstName("Edu")
      .setLastName("Simon")
      .setRole("señor developer")
    println(employee)


  }
}

class Person {

  protected var fname = ""
  protected var lname = ""

  def setFirstName(firstName: String): this.type = {
    fname = firstName
    this
  }

  def setLastName(lastName: String): this.type = {
    lname = lastName
    this
  }

}

class Employee extends Person {

  protected var role = ""

  def setRole(role: String): this.type = {
    this.role = role
    this
  }
  override def toString = {
    "%s, %s, %s".format(fname, lname, role)
  }

}
