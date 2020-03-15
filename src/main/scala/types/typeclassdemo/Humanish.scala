package types.typeclassdemo

object Humanish {
  // the type class.
  // defines an abstract method named 'speak'.
  trait HumanLike[A] { // <-- this is like JSONable
    def speak(speaker: A): Unit
  }

  // companion object
  object HumanLike {
    // implement the behavior for each desired type. in this case,
    // only for a Dog.
    implicit object DogIsHumanLike extends HumanLike[Dog] {
      def speak(dog: Dog) { println(s"I'm a Dog, my name is ${dog.name}") }
    }
  }
}
