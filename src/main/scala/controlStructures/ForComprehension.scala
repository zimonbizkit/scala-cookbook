package controlStructures

object ForComprehension {
  def main(args: Array[String]): Unit = {
    val arrNames = Seq(
      Seq(
        Seq(
          "Potato","One","Two","Three"
        ),
        Seq(
          "Potata","One","Two","Thr3e"
        ),
        Seq(
          "Patato","O4e","Twf","Thr5e"
        ),
      )
    )


    println(
      for {
        dim1 <- arrNames
        dim2 <- dim1
        dim3 <- dim2
      } yield {
        dim3.toLowerCase
      }
    )

    // this is ugly but works as a for comprehension too
    println(
      arrNames.map(
        d1 => d1.map(
          d2 => d2.map(
            d3 => d3.toUpperCase()
          )
        )
      )
    )
  }
}
