package functionalProgramming

object PartiallyAppliedFunctions {
  def main(args: Array[String]): Unit = {
    println(wrapWithDiv("asdasda"))
    println(wrapWithAnchor("23232323 superlink"))

    //@NOTE = I sense this is a way to properly do functional programming by function composition by the parameters
  }
  def wrap(prefix: String, html: String, suffix: String) = {
    prefix + html + suffix
  }
  val wrapWithDiv = wrap("<div>", _: String, "</div>")
  val wrapWithAnchor = wrap("<a>",_:String,"</a")

}
