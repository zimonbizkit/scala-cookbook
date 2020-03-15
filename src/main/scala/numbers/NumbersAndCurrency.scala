package numbers

object NumbersAndCurrency {
  def main(args: Array[String]): Unit = {
     val pi = scala.math.Pi
    println(f"$pi%1.5f")
    println(f"$pi%1.2f")
    println(f"$pi%06.2f")

    val locale = new java.util.Locale("de","DE")

    val sformatter = java.text.NumberFormat.getInstance()
    val formatter = java.text.NumberFormat.getIntegerInstance(
      locale
    )

    println(formatter.format(19999999))

    println(sformatter.format(100000.33))

    // NOTE: there is also a java currency formatter but I don't think letting a lanaguage format currencies is a good
    // thing
  }
}
