package classesAndProperties

object SuperclassConstructors {
  def main(args: Array[String]): Unit = {
    val e: AnEmployee = new AnEmployee(
      "lkajsdlakjsd",
      ARole("adasda"),
        AnAddress("BCN","STATEBCN"),
    )
    println(e)

    println(new AnEmployee("ONLYTHENAME")) // <---- constructor flexibility with the "def this"
                                                  // @NOTE : IDK why but I don't know this flexibility

  }
}

class Animal (var name:String, var age:Int)

class Dog (name:String) extends Animal (name,0) // <--- the latter parameter definition is enforced by the Animal superclass


case class AnAddress (city: String, state: String)
case class ARole (role: String)

class APerson (var name: String, var address: AnAddress) {

  // no way for Employee auxiliary constructors to call this constructor
  def this (name: String) {
    this(name, null)
    address = null
  }

  override def toString = if (address == null) name else s"$name @ $address"

}

class AnEmployee (name: String, role: ARole, address: AnAddress)
  extends APerson (name, address) {

  def this (name: String) {
    this(name, null, null)
  }

  def this (name: String, role: ARole) {
    this(name, role, null)
  }

  def this (name: String, address: AnAddress) {
    this(name, null, address)
  }

}