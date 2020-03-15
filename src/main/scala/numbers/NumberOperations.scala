package numbers

object NumberOperations {
  def main(args: Array[String]): Unit = {
    var x =1
    println(x*2)
    println(x+123123)
    println(x/1)
    x +=1
    x *=3
    x /=1
    println(x)

    /* --------- Reassignment to val not possible, only possible for vars

    val f = 1f
    f*=2
    */
  }
}
