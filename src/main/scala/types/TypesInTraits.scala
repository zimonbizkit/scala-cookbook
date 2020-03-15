package types

trait Pair[A, B] {
  def getKey: A
  def getValue: B
}
trait SeqOfPairs[A,B] {
  def getByKey(k:A): Pair[A,B]
  def getByValue(v:B): Pair[A,B]
}
object TypesInTraits {
  def main(args: Array[String]): Unit = {
    // will need to think a way of how to use this traits
  }
}

