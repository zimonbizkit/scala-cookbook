package types

object Introduction {
  def main(args: Array[String]): Unit = {
    new VarianceExamples
  }
}
class Grandparent
class Parent extends Grandparent
class Child extends Parent

class InvariantClass[A]
class CovariantClass[+A]
class ContravariantClass[-A]

class VarianceExamples {

  def invarMethod(x: InvariantClass[Parent]) {}
  def covarMethod(x: CovariantClass[Parent]) {}
  def contraMethod(x: ContravariantClass[Parent]) {}

  //invarMethod(new InvariantClass[Child])             // ERROR - won't compile
  invarMethod(new InvariantClass[Parent])            // success
  //invarMethod(new InvariantClass[Grandparent])       // ERROR - won't compile

  covarMethod(new CovariantClass[Child])             // success
  covarMethod(new CovariantClass[Parent])            // success
  //covarMethod(new CovariantClass[Grandparent])       // ERROR - won't compile

  //contraMethod(new ContravariantClass[Child])        // ERROR - won't compile
  contraMethod(new ContravariantClass[Parent])       // success
  contraMethod(new ContravariantClass[Grandparent])  // success

}
