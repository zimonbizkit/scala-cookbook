package controlStructures

object ForWithConditionals {
  def main(args: Array[String]): Unit = {

    // this
    for (i <- 1 to 10 if i % 2 == 0) println(i)

    // is the same as
    for {
      i <- 1 to 10
      if i % 2 == 0
    } println(i)

    // we can concatenate guards as we like
    for {
      i <- 1 to 10
      if i > 3
      if i < 6
      if i % 2 == 0
    } println(i)

    for {
      i <- 1 to 1000
      if passesFilter1(i)
      if passesFilter2(i)
    } println(s"supernumber $i")
  }

  def passesFilter1(i: Int) = i % 8 == 0
  def passesFilter2(i: Int) = i % 5 == 0

}
