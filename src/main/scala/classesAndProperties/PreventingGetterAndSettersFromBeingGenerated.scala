package classesAndProperties

object PreventingGetterAndSettersFromBeingGenerated {
  def main(args: Array[String]): Unit = {
    val s1 = new Stock
    s1.setPrice(20)

    val s2 = new Stock
    s2.setPrice(100)

    println(s2.isHigher(s1))
  }
}

class Stock {
  // a private[this] var is object-private, and can only be seen
  // by the current instance
  private [this] var price: Double = _
  private var otherPrice: Double= _
  def setPrice(p: Double) { price = p }
  def isHigher(that: Stock): Boolean = this.price > that.otherPrice
  //def isHigher(that: Stock): Boolean = this.price > that.price
  //                                                        ^
  //                                                        |________ this won't compile

}

/*@NOTE: The difference between "private" and "object-private" , is that the latter it can only be accessed from the object
* that contains it*/
