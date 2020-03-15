package methods {

  /*
* @NOTE:

Scala lets you control method visibility in a more granular and powerful way than Java. In order from “most restrictive” to “most open,” Scala provides these scope options:

 -Object-private scope

- Private

- Package

- Package-specific
*
*
* */
  object ControllingMethodScope {
    def main(args: Array[String]): Unit = {
      val f = new Foo
      f.getClass.getMethods.foreach(println)
    }
  }

  class Foo {
    private[this] def objectPrivateIsFoo = true

    private def privateIsFoo = true

    protected def protectedIsFoo = true

    private[methods] def packageProtectedIsFoo = true
    //private[anotherScope] def packageSpecificIsFoo = true
    //         ^
    // @note   |_________ seemingly, this scope identifier can specify from which package this method can be seen
  }

}

/*package com.main.scala.anotherScope {

  import methods.Foo

  class Bar {
    val f = new Foo
    println(f.packageSpecificIsFoo)
  }
}*/

//@NOTE: won't compile if cincluding the anotherScope package, will ask why