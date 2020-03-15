package strings

import strings.EduStringUtils

class AddingOwnMethods {
  def main(args: Array[String]): Unit = {
    val str="potato"

    // below won't work, will check why

    //str.increment
  }
}

object EduStringUtils {
  implicit class EduStringImprovements(val s: String) {
    def increment : String = s.map(c=> (c+1).toChar)
    def asBoolean : Boolean = s match {
      case "0" | "zero" | "" | " " => false
      case _ => true
    }
  }
}
