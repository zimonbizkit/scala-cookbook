package controlStructures

object ForWithCounters {
  def main(args: Array[String]): Unit = {

    val r = scala.util.Random

    for (i <- 1 to 10; j <- 1 to 10) println(s"$i<->$j")

    for {
      i <- 1 to 4
      j <- 1 to 4
    } println(s"$i<->$j")

    val arr = Array.ofDim[Int](2,2)


    // below wont work, will need to check why
    for {
      i <- 0 to 1
      j <- 0 to 1
    } arr(i)(j) = r.nextInt()

    println(arr)

    for {
      i <- 1 to 2
      j <- 2 to 3
    } println(s"i = $i, j = $j")

  }
}
