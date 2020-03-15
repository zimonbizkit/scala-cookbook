package strings

object Introduction  {
    def main(args: Array[String]): Unit = {
    val s  = "hello,world"

    println(s.length)

    s.foreach(println)

    for(c <- s) println(c)

    for(c <- s.getBytes()) println(c)

    println(s.filter(_ != 'l'))
  }
}
