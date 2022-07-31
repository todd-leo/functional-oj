package com.toddleo.functional.oj
package HackerRank.Prepare.Algorithms.Implementation

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class BreakingTheRecords extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  it should "just pass" in {
    solution(Array(10, 5, 20, 20, 4, 5, 2, 25, 1)) should contain theSameElementsInOrderAs Seq(2, 4)
  }


  def solution(scores: Array[Int]): Array[Int] = {
    // Write your code here
    val stats = scores.tail.foldLeft((scores.head, scores.head, 0, 0)) { case ((min, max, breakMin, breakMax), score) =>
      score match {
        case m if score < min => (m, max, breakMin + 1, breakMax)
        case m if score > max => (min, m, breakMin, breakMax + 1)
        case _ => (min, max, breakMin, breakMax)
      }}
    Array(stats._4, stats._3)
  }
}
