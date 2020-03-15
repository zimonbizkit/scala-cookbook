package objects

import javax.sound.sampled.{DataLine, TargetDataLine}

object GettingTheClassOfAnObject {
  def main(args: Array[String]): Unit = {
    //                          .--------@NOTE: Use the "classOf˝ method to know from which interface or from which
    //                          |        class commes an object
    //                          v
    println(new DataLine.Info(classOf[TargetDataLine],null))
  }
}
