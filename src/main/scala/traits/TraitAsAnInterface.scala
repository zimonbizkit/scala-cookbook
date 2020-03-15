package traits

object TraitAsAnInterface {
  def main(args: Array[String]): Unit = {
    val s = new Mp3SoundPlayer
    val sp = new SimplePlayerImplementation

    s.play
    s.stop
    s.pause
    s.close

    sp.play
    sp.pause
  }
}

class SimplePlayerImplementation extends SimplePlayer {
  override def pause: Unit = println("pausing simple")

  override def stop: Unit = println("stopping simple ")

  override def resume: Unit =  println("resuming simple")
}

abstract class SimplePlayer extends SoundPlayer {
  override def play: Unit = println("simpleplaying")
  override def close: Unit = println("simplestopping")
}

class Mp3SoundPlayer extends SoundPlayer {
  override def play: Unit = println("playing")

  override def close: Unit = println("closing")

  override def pause: Unit = println("pausing")

  override def stop: Unit = println("stopping")

  override def resume: Unit = println("resuming")
}

trait SoundPlayer {
  def play
  def close
  def pause
  def stop
  def resume
}

trait DogTrait {
  def speak(whatToSay: String)
  def wagTail(enabled: Boolean)
}
