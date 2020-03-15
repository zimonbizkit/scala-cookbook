package classesAndProperties

object AssigningAFieldToABlockOrFunction {
  def main(args: Array[String]): Unit = {
    val f = new Foo
    val f2 = new LazyFoo
  }
}

class Foo {

    val text: String = {
      var lines = ""
      try {
        println("printing ETC/PASSWD onnce")
        val fileHandle =io.Source.fromFile("/etc/passwd")  // beware that this will print all the passwd entries of your
                                                           // os (either Mac or Linux)
        lines = fileHandle.getLines.mkString
        fileHandle.close()
      } catch {
        case e: Exception => lines = "Error happened"
      }
      lines
    }
    println(text)
}
// @NOTE: Seemingly, the body without methods in the Foo class act as the construction context of the instance of it.

class LazyFoo {

  lazy val text = {
    val text: String = {
      var lines = ""
      try {
        println
        println
        println("printing ETC/PASSWD the second time lazily")
        println
        println
        val fileHandle =io.Source.fromFile("/etc/passwd")  // beware that this will print all the passwd entries of your
        // os (either Mac or Linux)
        lines = fileHandle.getLines.mkString
        fileHandle.close()
      } catch {
        case e: Exception => lines = "Error happened"
      }
      lines
    }
    println(text)
  }
}
// @NOTE = the second text is not printed, as the moment where is being processed is _only_ the moment is accessed.
// @NOTE = therefore, should it be putting as much _lazy_ values in a class as possible, a good practice, so as to prevent
// compiling clutter?
