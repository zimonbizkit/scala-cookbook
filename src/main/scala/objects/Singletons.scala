package objects

import java.text.SimpleDateFormat
import java.util.Calendar

object Singletons {
  def main(args: Array[String]): Unit = {
    CashRegister.open
    CashRegister.close
    // there is no "new" keyword here as the object is already built in the package context.

    println(DateUtils.getCurrentDate)
    println(DateUtils.getCurrentTime)
  }
}

object CashRegister {
  def open = println("opened")
  def close = println("closed")
}

object DateUtils {

  // as "Thursday, November 29"
  def getCurrentDate: String = getCurrentDateTime("EEEE, MMMM d")

  // as "6:20 p.m."
  def getCurrentTime: String = getCurrentDateTime("K:m aa")

  // a common function used by other date/time functions
  private def getCurrentDateTime(dateTimeFormat: String): String = {
    val dateFormat = new SimpleDateFormat(dateTimeFormat)
    val cal = Calendar.getInstance()
    dateFormat.format(cal.getTime())
  }

}
