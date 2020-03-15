package methods

object CallingSuperclassMethods {
  def main(args: Array[String]): Unit = {
    Seq(
      new WelcomeActivity,
      new GoodbyeActivity
    ).foreach( a =>
      println(a.onCreate("potato"))
    )
  }
}
abstract class Activity {
  def onCreate(bundle: String): String = {
    "hello super"
  }
}
class WelcomeActivity extends Activity {
  override def onCreate(bundle: String): String =  {
    super.onCreate(bundle)
  }
}
class GoodbyeActivity extends Activity {
  override def onCreate(bundle: String): String =  {
  "goodbye concrete"
}
}