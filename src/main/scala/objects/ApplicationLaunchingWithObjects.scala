package objects
//
//                                              .------------------.
//                                             _|_                 |
object ApplicationLaunchingWithObjects extends App{ //             v
  println("printing stuff as this object is for just launching an app, there are no methods in it")

  if (args.length == 1)
    println(s"Hello, ${args(0)}")
  else
    println("I didn't get your name.")
}
