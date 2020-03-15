package numbers

object NumberLists {
  def main(args: Array[String]): Unit = {

    println(
      (1 to 10 by 2).mkString(",")
    )


    println(
      (1 to 10 by 3).mkString(",")
    )

    //@NOTE = this works if we import scala.language.postfixOps

    //val x = 1 to 10 by 3 toArray

    //println(x)

    println(
      (for (i <- 1 to 5) yield i * 2).mkString(",")
    )


    (1 to 10).foreach( i => println(s"counter now is in $i"))
  }
}
