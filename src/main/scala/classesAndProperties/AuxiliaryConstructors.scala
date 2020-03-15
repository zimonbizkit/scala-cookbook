package classesAndProperties

object AuxiliaryConstructors {
  def main(args: Array[String]): Unit = {

    // I don't like auxiliary consrtructors
    val p5 = new Pizza(34)
    val p6 = new Pizza("BIG")
    val p1 = new Pizza(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE)
    val p2 = new Pizza(Pizza.DEFAULT_CRUST_SIZE)
    val p3 = new Pizza(Pizza.DEFAULT_CRUST_TYPE)
    val p4 = new Pizza
  }
}

class Pizza (var crustSize: Int, var crustType: String) {

  def this(crustSize: Int) {
    this(crustSize, Pizza.DEFAULT_CRUST_TYPE)
  }


  def this(crustType: String) {
    this(Pizza.DEFAULT_CRUST_SIZE, crustType)
  }


  def this() {
    this(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE)
  }

  override def toString = s"A $crustSize inch pizza with a $crustType crust"

}

object Pizza {
  val DEFAULT_CRUST_SIZE = 12
  val DEFAULT_CRUST_TYPE = "THIN"
}