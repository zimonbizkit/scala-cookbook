package traits

object TraitsUsedOnlyByTypeSubclasses {
  def main(args: Array[String]): Unit = {

  }
}

// StarfleetWarpCore will only work if is part of a compound with starship
trait StarfleetWarpCore {
  this: Starship =>
  // more code here ...
}

class Starship
class Enterprise extends Starship with StarfleetWarpCore


trait WarpCore {
  this: Starship with WarpCoreEjector with FireExtinguisher =>
}//>¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨|
//                           |
trait WarpCoreEjector  //    |
trait FireExtinguisher //    |
//                           |
// this works , as is detined in the trait above
class Enterprise2 extends Starship
  with WarpCore
  with WarpCoreEjector
  with FireExtinguisher
