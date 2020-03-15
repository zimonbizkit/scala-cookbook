package fpMentoring

import scalaz._
import Scalaz._


case class Credentials(u:String,p:String)

object applicativeVsMonad{
  def main(args: Array[String]): Unit = {

    // trying to do nice but silly things here ->

    val nums = List(1,2,3)

    nums.map(_ + 1)
    nums.map(half)
    //nums.map(half)(_ + _)

    val settings = Map("U"->"paco","P"->"paco")

    // below is an applicative! use >>= to represent it in a nicer way
    //^(settings.get("U"),settings.get("P"))(Credentials.apply)
    //^(configString("U"),configString("P"))(Credentials.apply)

    for {
      user  <- settings.get("U")
      password <- settings.get("P")
    } yield Credentials(user,password)

    //-----------------------------------------------------------------------------------------------------

    //val wsettings[String,String] = Map("U"->"paco","P"->"paco")

    //^(configString("U"),configString("P"))(Credentials.apply)


  }

  def half(n:Int) :Option[Int] = (n % 2 == 0).option(n/2)

  //def configString(name:String): ErrorOr[String] = settings.get(name) \/> s"Missing $name setting"

  // this is not working -------.
  //                            v
  //def _configString(name:String): ErrorsOr[String] = settings.get(name).toSuccessNel(s"Missing $name setting")

  type ErrorOr[A] = String \/ A
  type ErrorsOr[A] = ValidationNel[String,A]
}

