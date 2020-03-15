package classesAndProperties

object PrivatePrimaryConstructor {
  def main(args: Array[String]): Unit = {
    val brain = Brain.getInstance
    println(brain)
  }
}

// doing a singleton pattern via a companion object of the Brain class
class Brain private {
  override def toString: String = "this is a brain"
}

object Brain {
  val brain  = new Brain
  def getInstance = brain
}
