package classesAndProperties

object UninitializedVarTypes {
  def main(args: Array[String]): Unit = {
    val p = LocPerson("Eduard","Simon")
    p.address = Some(
      Address("BCN","BCN","080809090909")
    )

    p.address.foreach { a =>
      println(a.city)
      println(a.state)
      println(a.zip)
    }
  }
}

case class Address(city: String, state: String, zip: String)
case class LocPerson(var username:String, var password:String) {
  var age = 0
  var firstName = ""
  var lastName = ""
  var address = None: Option[Address] // <--- apparently, for what in PHP there should be a nullable value,
                                      //      there should be an Option[the_type_of_var] as a good practice?
}
