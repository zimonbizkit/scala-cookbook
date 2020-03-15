package types.buildingFunctionalityWithTypes

sealed abstract class Attempt[A] {
  var isSuccess = false
  def getOrElse[B >: A](default: => B): B = if (isSuccess) get else default
  def get : A


}

object Attempt {
  def apply[A](f: => A): Attempt[A] =
    try {
      val result = f
      Succeeded(result)
    } catch {
      case e: Exception => Failed(e)
    }
}

final case class Failed[A](exception: Throwable) extends Attempt[A] {
  isSuccess = false
  def get: A = throw exception
}
final case class Succeeded[A](result: A) extends Attempt[A] {
  isSuccess = true
  def get = result
}
