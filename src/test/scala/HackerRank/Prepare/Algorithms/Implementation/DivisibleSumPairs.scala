package com.toddleo.functional.oj
package HackerRank.Prepare.Algorithms.Implementation

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class DivisibleSumPairs extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  it should "just pass" in {
    solution(6, 5, Array(1, 2, 3, 4, 5, 6)) shouldBe 3
    solution(6, 3, Array(1, 3, 2, 6, 1, 2)) shouldBe 5
  }


  def solution(n: Int, k: Int, ar: Array[Int]): Int = {
    // Write your code here
    Range(0, n).combinations(2).count { case p: Seq[Int] =>
      val (i: Int, j: Int) = (p.head, p.last)
      (ar(i) + ar(j)) % k == 0
    }
  }
}
