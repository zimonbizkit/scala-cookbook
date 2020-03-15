package controlStructures

object ForAndForeach {
  def main(args: Array[String]): Unit = {
    val a = Array("apple","banana","orange")

    // supersimple for
    for(e<-a)println(e)

    // same stuff but with foreach method on collections
    a.foreach(e => println(e.toUpperCase()))

    // just for iterating and if knowing the type of element is not necessary
    a.foreach(println(_))

    for((e,count) <- a.zipWithIndex) {
      println(s"$count is $a")
    }

    // 10 iterations loop
    for(i <- 1 to 10) println(i)

    // doesnt make sense but to check that you can put conditionals in for loops
    for(i <- 1 to 10 if i < 4) println(i)


    val names = Map(
      "fname" -> "Pepito",
      "lname" -> "Paco"
    )

    for ((k,v) <- names) println(s"[$k] => $v")


  names.foreach{ e =>
    println(e) // what is the e in case this is a key value and not just a value?
    // a tuple
    println(e._1)
    println(e._2)
  }

    for {
      i <- 1 to 10
      if i % 2 == 0
    } println(i)
  }
}
