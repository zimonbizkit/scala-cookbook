package objects

import java.net.{HttpURLConnection, URL}

object ObjectsCasting {
  def main(args: Array[String]): Unit = {
    val u: String = "https:///www.google.com"

    //                                            .---- @NOTE: Here I'm using the type system to have an object
    //                                            |     as an instance of HttpURLConnection
    //                                            v
    val connection = new URL(u).openConnection.asInstanceOf[HttpURLConnection]
    println(connection)
  }
}