package types

import scala.collection.mutable.ArrayBuffer

trait Animal {
  def speak
}

class NDog(name: String) extends Animal {
  def speak { println("woof") }
  override def toString = name
}

class NSuperDog( name: String) extends NDog(name) {
  def useSuperPower { println("Using my superpower!") }
}

object MakeMutableCollectionsInvariant {
  def main(args: Array[String]): Unit = {
    val fido = new NDog("Fido")
    val wonderDog = new NSuperDog("asd")
    val shaggy = new NSuperDog("asda")
    //                     ____.----------- @NOTE: invariance is set here as we are telling the supertype NDog
    val dogs = ArrayBuffer[NDog]()
    //                    ¨¨¨¨¨*------------@NOTE: if we put NSuperDog here, it won't compile as ArrayBuffer only accepts
    //                                             invariance
    dogs += fido
    dogs += wonderDog
    dogs += shaggy

    makeDogsSpeak(dogs)
  }
  def makeDogsSpeak(dogs: ArrayBuffer[NDog]) {
    dogs.foreach(_.speak)
  }

}
