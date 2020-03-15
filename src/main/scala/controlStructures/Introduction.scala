package controlStructures

object Introduction {
  def main(args: Array[String]): Unit = {
    val a,b,c:Boolean = true

    // value assignment as a return of control strucgtures
    val d = if(a) b else c

    val multiSeq : Seq[Seq[String]] = Seq(
      Seq("hello","how","are","you"),
      Seq("I","am","just","fine"),
      Seq("that's","good","to","know")
    )

    // supersimple for comprehension below

    for {
      sentence <- multiSeq
      word <- sentence
    } yield println(word.capitalize)

  }
}
