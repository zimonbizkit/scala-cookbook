package fpMentoring


// functors are composable, you could do composition with two functors

object SemigroupVsFoldableVsFunctor {
  /*def main(args: Array[String]): Unit = {
    Functor(List)

    def transform[F[_]:Functor](fa:F[Int]) :F[String] = {
      if (Random.nextBoolean) fa.as("nope")
      else fa.map(n => (n + 1) .toString)

    }

    println(transform(List(1,2,3)))
    println(transform(42.some))

    type F[A] = List[Option[A]]

    implicit val f = Functor[List].compose(Functor[Option])
    println(transform(42.some, None, 23.some))
  }*/
}
