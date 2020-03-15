package objects

object CompanionObjects {
  def main(args: Array[String]): Unit = {

    // object context accessors
    println(Pizza.CRUST_TYPE_THIN)
    println(Pizza.getFoo)

    //class context accessors for pizza
    println(new Pizza(Pizza.CRUST_TYPE_THIN))
  }
}

// Pizza class, non-static
class Pizza (var crustType: String) {
  override def toString = "Dynamic context = Crust type is " + crustType
}

// companion object, static
object Pizza {
  println("static context = ")
  val CRUST_TYPE_THIN = "thin"
  val CRUST_TYPE_THICK = "thick"
  def getFoo = "Foo"
}

