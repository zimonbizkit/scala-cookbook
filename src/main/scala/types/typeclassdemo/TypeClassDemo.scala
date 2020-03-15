package types.typeclassdemo

import types.typeclassdemo.Humanish.HumanLike

object TypeClassDemo {
  // create a method to make an animal speak
  def makeHumanLikeThingSpeak[A](animal: A)(implicit humanLike: HumanLike[A]) {
    humanLike.speak(animal)
  }

  def main(args: Array[String]): Unit = {
    makeHumanLikeThingSpeak(Dog("Rover"))
    //@NOTE: I don't understand why there's an "implicit parameter warning" from the IDE
    // when calling the function with a 'Cat',when it should highlight the error of not
    // being able to find an implementation of humanlike
  }
}
