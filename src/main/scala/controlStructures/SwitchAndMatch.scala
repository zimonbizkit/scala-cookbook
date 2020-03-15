package controlStructures

import scala.annotation.switch

object SwitchAndMatch {
  def main(args: Array[String]): Unit = {

    // transforming the switch to a table lookup like
    (1 to 13: @switch).foreach{
      case 1 => println("J")
      case 2 => println("F")
      case 3 => println("M")
      case 4 => println("A")
      case 5 => println("M")
      case 6 => println("J")
      case 7 => println("J")
      case 8 => println("A")
      case 9 => println("S")
      case 10 => println("O")
      case 11 => println("N")
      case 12 => println("D")
      case _ => println("wtf")

        // anyhow this optimization won't make much sense as for small structures a map would be enough
      val monthNumberToName = Map(
        1  -> "January",
        2  -> "February",
        3  -> "March",
        4  -> "April",
        5  -> "May",
        6  -> "June",
        7  -> "July",
        8  -> "August",
        9  -> "September",
        10 -> "October",
        11 -> "November",
        12 -> "December"
      )

      val monthName = monthNumberToName(4)
      println(monthName)  // prints "April"


    }
  }
}
