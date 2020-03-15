package classesAndProperties

object PrimaryConstructor {
  def main(args: Array[String]): Unit = {
    println(new localPerson("A","B"))
    println(new localPerson("C","D"))
    val localPerson : localPerson = new localPerson("hey","ho")

    localPerson.firstName = "Adam"
    localPerson.lastName = "Paco"

    localPerson.printFullname
  }
}

class localPerson(var firstName:String,var lastName: String) {

  override def toString :String = s"$firstName $lastName is $age and lives in $userHome"

  private val userHome = System.getProperty("user.home")
  var age= 0
  def printFullname  = println(this)
}
