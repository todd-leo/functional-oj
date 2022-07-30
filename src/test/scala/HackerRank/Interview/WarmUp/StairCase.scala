package com.toddleo.functional.oj
package HackerRank.Interview.WarmUp

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class StairCase extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  it should "just pass" in {
    solution(6) should contain theSameElementsInOrderAs Seq(
      "     #",
      "    ##",
      "   ###",
      "  ####",
      " #####",
      "######"
    )
  }

  def solution(n: Int): Seq[String] = {
    // Write your code here
    Range.inclusive(1, n).map { i =>
      (Seq.fill(n - i)(" ") ++ Seq.fill(i)("#")).mkString
    }
  }
}
