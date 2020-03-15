package objects

object ObjectInstancesWithoutNew {
  def main(args: Array[String]): Unit = {

    println(InstantiablePerson("Pepe").name)

    println(CaseClassedInstantiablePerson("Paco").name)

    // two ways to make new instances of objects without the new keword
    // the second one (case class) is the fastest one

    // However, the first one , that's using a companion object, can be used to bootstrap
    // some specific behaviour in the apply method of the InstantiablePerson object
  }
}

object InstantiablePerson {
  def apply(name: String): InstantiablePerson = {
    var p = new InstantiablePerson

    p.name = name
    p
  }
}

class InstantiablePerson {
  var name: String = _
}


case class CaseClassedInstantiablePerson(var name: String)