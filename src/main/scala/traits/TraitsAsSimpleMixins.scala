package traits

object TraitsAsSimpleMixins {
  def main(args: Array[String]): Unit = {
    val zeus = new ConcreteDog("Zeus")
    zeus.ownerIsHome
    zeus.jumpForJoy
  }
}

abstract class AbsPet (var name: String) {
  def speak // abstract
  def ownerIsHome { println("excited") }
  def jumpForJoy { println("jumping for joy") }
}

trait Tail {
  def wagTail { println("tail is wagging") }
  def stopTail { println("tail is stopped") }
}

//                                      .------------------.----------- @NOTE: Here, the mixin is built , by telling
//                                     |                   |            that "speak" & ownerIsHome has a
//                               ______|_______        ____|____        concrete (overriden) implementation, and that
class ConcreteDog (name: String) extends AbsPet (name) with Tail { //   wagTail is a behaviour coming from Tail trait
  def speak { println("woof") }
  override def ownerIsHome {
    wagTail
    speak
  }
}



