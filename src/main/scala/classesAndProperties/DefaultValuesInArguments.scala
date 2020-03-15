package classesAndProperties

object DefaultValuesInArguments {
  def main(args: Array[String]): Unit = {

    // in scala you can name and position the arguments of a constructor if they have
    // default values
    println(new Socket())
    println(new Socket(timeout=3000, linger=4000))
    println(new Socket(linger=4000, timeout=3000))
    println(new Socket(timeout=3000))
    println(new Socket(linger=4000))
  }
}

class Socket(val timeout: Int = 1000, val linger: Int = 2000) {
  override def toString = s"timeout: $timeout, linger: $linger"
}
