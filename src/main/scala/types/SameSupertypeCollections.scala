package types

import scala.collection.mutable.ArrayBuffer

trait CrewMember
class Officer extends CrewMember
class RedShirt extends CrewMember
trait Captain
trait FirstOfficer
trait ShipsDoctor
trait StarfleetTrained


object SameSupertypeCollections {
  def main(args: Array[String]): Unit = {
    val kirk = new Officer with Captain
    val spock = new Officer with FirstOfficer
    val bones = new Officer with ShipsDoctor

    val officers = new Crew[Officer]()
    officers += kirk
    officers += spock
    officers += bones

  }
}

//           .-------- @NOTE: the upper bound type that's defined here tells that the type A refers to all classes that
//         __|____________    extend from CrewMember
class Crew[A <: CrewMember] extends ArrayBuffer[A]

