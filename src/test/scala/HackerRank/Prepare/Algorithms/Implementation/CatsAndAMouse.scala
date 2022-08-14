package com.toddleo.functional.oj
package HackerRank.Prepare.Algorithms.Implementation

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class CatsAndAMouse extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  it should "just pass" in {
    catAndMouse(1, 2, 3) shouldBe "Cat B"
    catAndMouse(1, 3, 2) shouldBe "Mouse C"
  }


  /**
   * @param x Cat A's position
   * @param y Cat B's position
   * @param z Mouse C's position
   * @return Either 'Cat A', 'Cat B', or 'Mouse C'
   */
  def catAndMouse(x: Int, y: Int, z: Int): String =
    Math.abs(x - z) - Math.abs(y - z) match {
      case a if a < 0 => "Cat A"
      case b if b > 0 => "Cat B"
      case c if c == 0 => "Mouse C"
    }
}
