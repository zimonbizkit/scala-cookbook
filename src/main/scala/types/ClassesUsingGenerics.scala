package types

import scala.annotation.tailrec

object ClassesUsingGenerics {
  def main(args: Array[String]): Unit = {
    val li = new LinkedList[Int]() // I like how IntellijIdea enforces you the type specification when writing the
                                   // implementation of the class
    li.add(1)
    li.add(2)
    li.add(3)

    li.printAll()

    val strings = new LinkedList[String]()
    strings.add("Nacho")
    strings.add("Libre")
    strings.printAll()

    val dogs = new LinkedList[Dog]

    dogs.add(new SuperDog)
    dogs.add(new FunnyDog)
    dogs.add(new Dog)

    printDogTypes(dogs)

    def printDogTypes(dogs:LinkedList[Dog]): Unit = dogs.printAll()
  }
}
trait Bicho
class Dog extends Bicho { override def toString = "Dog" }
class SuperDog extends Dog { override def toString = "SuperDog" }
class FunnyDog extends Dog { override def toString = "FunnyDog" }

class LinkedList[A] {

  private class Node[A] (elem: A) {
    var next: Node[A] = _
    override def toString = elem.toString
  }

  private var head: Node[A] = _

  def add(elem: A) {
    val n = new Node(elem)
    n.next = head
    head = n
  }

  @tailrec // @NOTE: this is possible because printNodes is the last call on the recursive function
  private def printNodes(n: Node[A]) {
    if (n != null) {
      println(n)
      printNodes(n.next)
    }
  }

  def printAll() { printNodes(head) }
}

