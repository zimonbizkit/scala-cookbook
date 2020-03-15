package traits

object TraitsInObjects {
  def main(args: Array[String]): Unit = {
    //@NOTE: Trait-ing object instances can be interesting to have certain usages of object instances decorated with
    // some behaviour (like logging or similar)
    val hulk = new DavidBanner with Angry
  }
}
class DavidBanner

trait Angry {
  println("You won't like me ...")
}
