package actors

import akka.actor.{Actor, ActorSystem, Props}

//@NOTE: here is the definition of the "actor". It's just a class that's being instantiated later
// that's extending from the Actor class itself
// it should override , at least, the method "recieve" that just patternmatches the message that's recieved
// so we can do something with it

// a class of an actor can have constructor arguments
class HelloActor(name: String) extends Actor {
  override def receive: Receive = {
    case "hello" => println(s"ola shur $name")
    case _ => println("k ise premoh")
  }
}

// then the caller of the actor system is this object
object SimpleActor {
  def main(args: Array[String]): Unit = {

    // here we instantiate a new system (of type ActorSystem) that seemingly we can tag with a name
    val system = ActorSystem("HelloSystem")

    // and we build an actor, of the type "HelloActor" above, with the 'Props' class.
    // The function "actorOf" has the type of the actor as the first parameter, and a name as the second one to tag it

    // However, we are not having a real Actor here, but a reference to it (ActorRef).
    //val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")
    val helloActor = system.actorOf(
      Props(new HelloActor("mano")), name = "helloactor")


    helloActor ! "hello"
    //         ^
    //@NOTE : This is the function used to pass messages to actors, in an infix fashion
    //         v
    helloActor ! "ei q pasa"

    // comment this line below to allow the process to run forever
    // "the process to run forever" = the actors to listen to messages
    system.terminate
  }
}