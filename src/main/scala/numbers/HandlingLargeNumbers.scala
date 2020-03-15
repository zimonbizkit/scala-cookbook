package numbers

object HandlingLargeNumbers {
  def main(args: Array[String]): Unit = {
    var b :BigInt = BigInt(1234567890)
    var d :BigDecimal = BigDecimal(123345.3454)

    println(b +b)
    println(d +d)
    println(b.toDouble)
    println(b.toLong)
    if (b.isValidInt)println(b.toInt)

    println(Double.PositiveInfinity)
    println(Double.NegativeInfinity) // <---- wtf is this
    println(Double.NegativeInfinity.toInt) // <---- also wtf is this

  }
}
