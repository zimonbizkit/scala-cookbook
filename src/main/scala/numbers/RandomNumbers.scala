package numbers

object RandomNumbers {
  def main(args: Array[String]): Unit = {
    val r = scala.util.Random
    for (c <- 1 to 100 ){
      println(r.nextInt(394))
      println(r.nextPrintableChar())
    }

    println(
      for(i <- 0 to r.nextInt(50)) yield r.nextPrintableChar()
    )
  }
}
