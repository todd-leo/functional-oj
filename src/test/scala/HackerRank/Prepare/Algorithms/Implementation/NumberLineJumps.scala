package com.toddleo.functional.oj
package HackerRank.Prepare.Algorithms.Implementation

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class NumberLineJumps extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  it should "just pass" in {
    solution(x1 = 0, v1 = 3, x2 = 4, v2 = 2) shouldBe "YES"
    solution(x1 = 0, v1 = 2, x2 = 5, v2 = 3) shouldBe "NO"
  }

  /**
   * Complete the 'kangaroo' function below.
   * @param x1 starting position for kangaroo 1
   * @param v1 jump distance for kangaroo 1
   * @param x2 starting position for kangaroo 2
   * @param v2 jump distance for kangaroo 2
   * @return either YES or NO
   */
  def solution(x1: Int, v1: Int, x2: Int, v2: Int): String = {
    if (x1 > x2)
      "NO"
    else if (x1 == x2)
      "YES"
    else if (v1 <= v2)
      "NO"
    else {
      (x1 - x2) % (v1 - v2) == 0 match {
        case true => "YES"
        case false => "NO"
      }
    }
  }
}
