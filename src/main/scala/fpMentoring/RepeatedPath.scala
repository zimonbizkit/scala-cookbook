package fpMentoring

final case class ProgramPosition(x:Integer,y:Integer)

case class Movement(m: Char) {
  def isValid:Boolean  = Movement.ValidMovements contains m
}

object Movement {
  val ValidMovements: List[Char] = List('>','v','^','<')
}

object RepeatedPath {
  def main(args: Array[String]): Unit = {
    var doneMovements : Seq[Movement] = Seq()
    val rawMovements = "v>>v^<"
    val convertedMovements : Seq[Movement] = rawMovements.map(Movement(_))

    convertedMovements.filter(_.isValid)

    // parser evaluated?
    // lazy evaluatrion

    // ephemeral streams in scalaz??????

  }
}
