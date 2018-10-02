package day1

import minitest._

/*
 * ADT models data while Function models behaviour.
 * A function is simply something that accepts an input value
 * and produces an output value.
 * In more accademic terms it connects a Domain to a Codomain.
 * Functions are described/documented by it's type definition.
 *
 *  f:  InType => OutType
 *
 */
object FunctionsTests extends SimpleTestSuite {

  /*
   * TODO: implement reciprocalString
   *
   */

  val asString: Double => String = in => in.toString

  val parseString: String => Int = in => in.toInt

  val reciprocal: Int => Double = in => 1.0 / in

  val reciprocalString: String => String = in => {
    ???
  }

  test("from string to string throught reciprocal") {
    assertEquals(reciprocalString("42"), "0.023809523809523808")
  }
}
