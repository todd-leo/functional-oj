package com.toddleo.functional.oj
package HackerRank.Prepare.Algorithms.Implementation

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class SubarrayDivision extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  it should "just pass" in {
    solution(Array(1, 2, 1, 3, 2), 3, 2) shouldBe 2
    solution(Array(1, 1, 1, 1, 1, 1), 3, 2) shouldBe 0
  }


  def solution(s: Array[Int], d: Int, m: Int): Int = {
    // Write your code here
    s.sliding(m).foldLeft(0) { (count, window) =>
      if (window.sum == d)
        count + 1
      else count
    }
  }
}
