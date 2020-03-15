package types

// Doesnt work, will need to check why
class dDog { def speak() { println("woof") } }
class Klingon { def speak() { println("Qapla!") } }

//@NOTE: Reflective calls need to be enabled when using structural types.
// not a good idea when performance is a concern
object DuckTypingWithStructuralTypes {
  def main(args: Array[String]): Unit = {
    callSpeak(new dDog)
    callSpeak(new Klingon)
  }
  //                       .------------ A refers to a class that has the method Speak implemented, otherwise won't work
  //            ___________|______________
  def callSpeak[A <: { def speak(): Unit }](obj: A) {
    obj.speak()
  }
}

