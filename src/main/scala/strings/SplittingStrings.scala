package strings

object SplittingStrings {
  def main(args: Array[String]): Unit = {
    "Hello world".split(" ").foreach(println)

    val commaSeparatedList = "eggs, milk, butter, coco    ,potato"

    commaSeparatedList.split(",").map(_.trim).foreach(println)
  }
}
