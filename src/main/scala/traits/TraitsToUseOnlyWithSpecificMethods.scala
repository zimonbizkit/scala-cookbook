package traits

object TraitsToUseOnlyWithSpecificMethods {
  def main(args: Array[String]): Unit = {
    val cl = new ComplexClassImplementation
    println(cl.ejectWarpCore("asdasd"))
    println(cl.ejectWarpCore("password"))
  }
}

// @NOTE: I don't know which is the potential of this as it works as opposite as an interface...
// According to the book, structural typing is the reason why we would use traits to "enforce" the implementation of methods
// something you can also achieve using traits as an interface.

trait ComplexTrait {
  this: {
    def ejectWarpCore(password: String): Boolean
    def startWarpCore : Unit
  } =>
}
class BaseComplexClass {
// code here ...
}

class ComplexClassImplementation extends BaseComplexClass with ComplexTrait {
  def ejectWarpCore(password: String): Boolean = {
    if (password == "password") {
      println("ejecting core")
      true
    } else {
      false
    }
  }
  def startWarpCore : Unit = {

  }
}