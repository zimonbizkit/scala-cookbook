package methods

object DefaultValuesForMethodParameters {
  def main(args: Array[String]): Unit = {
    val c = new Connection
    println(c.makeConnection())
    println(c.makeConnection(2000)) // defaulting values
    println(c.makeConnection(2000,"ftp"))
    println(c.makeConnection(protocol = "ftp",timeout = 39)) // and even swapping them by naming them
                                    // @note ,¨¨¨¨¨¨¨¨this, comes in super handy when trying to put just one specific
  }                                 // value over a defaulted ones, and not needing to put valued ones because of it
}

class Connection {
  def makeConnection(timeout: Int = 5000, protocol: String  = "http") {
    println("timeout = %d, protocol = %s".format(timeout, protocol))
  }
}
